package org.koreait.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.board.BoardDataForm;
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
        boardData = new BoardDataForm();
        boardData.setPoster("작성자");
        boardData.setSubject("제목");
        boardData.setContent("내용");
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

    }
}
