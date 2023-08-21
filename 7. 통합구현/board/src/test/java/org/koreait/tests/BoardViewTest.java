package org.koreait.tests;

import org.junit.jupiter.api.BeforeEach;
import org.koreait.controllers.BoardForm;
import org.koreait.models.board.BoardInfoService;
import org.koreait.models.board.BoardSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

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
}
