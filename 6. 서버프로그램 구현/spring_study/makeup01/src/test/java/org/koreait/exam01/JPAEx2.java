package org.koreait.exam01;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.koreait.constants.UserType;
import org.koreait.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class JPAEx2 {
    @Autowired
    private EntityManager em;

    @Test
    void test1() {
        Users users = Users.builder()
                .userId("user01")
                .userNm("사용자01")
                .userPw("123456")
                .userType(UserType.MEMBER)
                .email("user01@test.org")
                .mobile("0100000")
                .intro("자기소개")
                .build();
        em.persist(users);
        em.flush();
        em.detach(users);

        users = em.find(Users.class, users.getUserNo());
        System.out.println(users);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        users.setUserNm("(수정)사용자01");
        em.flush();
        em.detach(users);


        users = em.find(Users.class, users.getUserNo());
        System.out.println(users);
    }

    @Test
    void test2() {
        Users users = Users.builder()
                .userId("user01")
                .userNm("사용자01")
                .userPw("123456")
                .email("user01@test.org")
                .mobile("0100000")
                .intro("자기소개")
                .userType(UserType.MEMBER)
                .build();
        em.persist(users);
        em.flush();
        em.detach(users);


        users = em.find(Users.class, users.getUserNo());
        System.out.println(users);
    }
}
