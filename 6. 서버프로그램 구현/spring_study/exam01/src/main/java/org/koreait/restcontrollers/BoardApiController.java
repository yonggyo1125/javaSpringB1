package org.koreait.restcontrollers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.controllers.board.BoardDataForm;
import org.koreait.models.board.BoardData;
import org.koreait.models.board.SaveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final SaveService saveService;

    @GetMapping("/info")
    public BoardData info() {
        BoardData data = BoardData.builder()
                .id(1L)
                .subject("제목1")
                .content("내용1")
                .poster("작성자1")
                .regDt(LocalDateTime.now())
                .build();
        return data;
    }

    @GetMapping("/list")
    public List<BoardData> list() {
        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            BoardData data = BoardData.builder()
                    .id(i)
                    .subject("제목" + i)
                    .content("내용" + i)
                    .poster("작성자" + i)
                    .regDt(LocalDateTime.now())
                    .build();
            items.add(data);
        }
        return items;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/process")
    public void process() {
        log.info("내부 처리중....");
    }

    @PostMapping("/register")
    public void register(BoardDataForm form) {
        saveService.save(form);
    }
}
