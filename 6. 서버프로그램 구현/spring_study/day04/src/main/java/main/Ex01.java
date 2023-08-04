package main;

import config.AppCtx;
import models.board.BoardDao;
import models.board.BoardData;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        BoardDao boardDao = ctx.getBean(BoardDao.class);

        // register
        BoardData data = BoardData.builder()
                        .poster("저자2")
                        .subject("제목2")
                        .content("내용2")
                        .build();
        boolean result = boardDao.register(data);
        System.out.println("결과 : " + result);

        // gets()
        List<BoardData> items = boardDao.gets();
        items.stream().forEach(System.out::println);

        ctx.close();
    }
}
