package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Users;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class JPAEx2 {
    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {
        Users user = Users.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .regDt(LocalDateTime.now())
                .build();
        em.persist(user);
        em.flush();
        em.clear();

        Users user1 = em.find(Users.class, 1L);
        System.out.println(user1);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        user1.setUserNm("(수정)사용자01");
        Users user2 = em.find(Users.class, 1L);
        System.out.println(user2);
    }
}
