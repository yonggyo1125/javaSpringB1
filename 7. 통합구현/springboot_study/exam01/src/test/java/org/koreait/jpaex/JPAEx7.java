package org.koreait.jpaex;

import org.junit.jupiter.api.BeforeEach;
import org.koreait.constants.UserType;
import org.koreait.entities.BoardData;
import org.koreait.entities.Users;
import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class JPAEx7 {

    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private UsersRepository usersRepository;

    @BeforeEach
    void init() {
        Users user = Users
                .builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .type(UserType.USER)
                .build();
        usersRepository.saveAndFlush(user);

        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            BoardData item = BoardData.builder()
                    .poster("작성자" + i)
                    .subject("제목" + i)
                    .content("내용" + i)
                    .user(user)
                    .build();
            items.add(item);
        }

        boardDataRepository.saveAllAndFlush(items);
     }
}
