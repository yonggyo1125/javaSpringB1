package org.koreait.exam01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.entities.BoardData;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
public class JPAEx3 {
    @Autowired
    private BoardDataRepository repository;

    @BeforeEach
    void init() {
        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            items.add(BoardData.builder()
                    .poster("저자" + i)
                    .subject("제목" + i)
                    .content("내용" + i).build());
        }

        repository.saveAllAndFlush(items);
    }

    @Test
    void test1() {
        List<BoardData> items = repository.findAll();
        items.stream().forEach(System.out::println);
    }
}
