package org.koreait.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardInfoService;
import org.koreait.models.board.BoardSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@SpringBootTest
@Transactional
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.properties")
public class BoardViewTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BoardSaveService saveService;

    private BoardForm boardForm;

    @BeforeEach
    void init() {
        boardForm = BoardForm.builder()
                .subject("제목1")
                .content("내용1")
                .build();
        saveService.save(boardForm);
    }

    @Test
    @DisplayName("게시글 조회 성공시 응답 코드 200, 저장전 데이터와 조회된 데이터의 동일 여부 체크")
    void test1() {
        mockMvc.perform(get("/api/board/view/" + boardForm.getId()))
    }
}
