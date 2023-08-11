package org.koreait.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.board.BoardDataForm;
import org.koreait.models.board.BoardValidationException;
import org.koreait.models.board.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("게시글 저장 서비스 테스트")
public class BoardSaveServiceTest {

    @Autowired
    private SaveService saveService;

    private BoardDataForm boardData;

    @BeforeEach
    void init() {
        boardData = getData();
    }

    private BoardDataForm getData() {
        BoardDataForm boardData = new BoardDataForm();
        boardData.setPoster("작성자");
        boardData.setSubject("제목");
        boardData.setContent("내용");

        return boardData;
    }

    @Test
    @DisplayName("게시글 작성,수정 성공시 예외가 발생하지 않음")
    void saveSuccessTest() {
        assertDoesNotThrow(() -> {
            saveService.save(boardData);
        });
    }

    @Test
    @DisplayName("필수 항목(poster, subject, content) 검증, 검증 실패 BoardValidationException 발생")
    void requiredFieldsTest() {

        assertAll(
                () -> {
                    // poster가 null
                    boardData = getData();
                    boardData.setPoster(null);
                    requiredFieldTestEach(boardData, "작성자");
                },
                () -> {
                    // poster가 빈값
                    boardData = getData();
                    boardData.setPoster("     ");
                    requiredFieldTestEach(boardData, "작성자");
                },
                () -> {
                    // subject가 null
                    boardData = getData();
                    boardData.setSubject(null);
                    requiredFieldTestEach(boardData, "제목");
                },
                () -> {
                    // subject가 빈값
                    boardData = getData();
                    boardData.setSubject("     ");
                    requiredFieldTestEach(boardData, "제목");
                },
                () -> {
                    // content가 null
                    boardData = getData();
                    boardData.setContent(null);
                    requiredFieldTestEach(boardData, "내용");
                },
                () -> {
                    // content가 빈값
                    boardData = getData();
                    boardData.setContent("    ");
                    requiredFieldTestEach(boardData, "내용");
                }
        );
    }

    @Test
    @DisplayName("저장전 데이터와 저장된 데이터의 일치 여부")
    void saveResultTest() {
        saveService.save(boardData);
        BoardDataForm result = infoService.get(boardData.getId());

        assertAll(
                () -> assertEquals(boardData.getPoster(), result.getPoster()),
                () -> assertEquals(boardData.getSubject(), result.getSubject()),
                () -> assertEquals(boardData.getContent(), result.getContent())
        );
    }

    private void requiredFieldTestEach(BoardDataForm data, String message) {
        BoardValidationException thrown = assertThrows(BoardValidationException.class, () -> {
            saveService.save(data);
        });
        assertTrue(thrown.getMessage().contains(message));
    }
}
