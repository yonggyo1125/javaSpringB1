package org.koreait.restcontrollers;

import org.koreait.models.board.BoardData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/board")
public class BoardApiController {
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
}
