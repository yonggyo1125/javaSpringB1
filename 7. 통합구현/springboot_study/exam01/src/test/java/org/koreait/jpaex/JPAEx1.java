package org.koreait.jpaex;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Users;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class JPAEx1 {
    @PersistenceContext // @Autowired와 동일 역할
    private EntityManager em;

    @BeforeEach
    void init() {
        Users user = Users.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .regDt(LocalDateTime.now())
                .build();
        em.persist(user);
        em.flush();
        //em.clear();
    }

    @Test
    void test1() {
        Users user = Users.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .regDt(LocalDateTime.now())
                .build();

        em.persist(user); // 영속 상태 : 변화감지
        em.flush();

        em.detach(user); // 영속성 분리 : 변화감지 X

        user.setUserNm("(수정)사용자01"); 
        em.flush(); // UPDATE 쿼리

        em.merge(user); // 분리된 영속성 -> 영속 상태 : 변화 감지 O
        em.flush();

        /*
        em.remove(user); // 영속 상태 : 제거 상태
        em.flush(); // DELETE 쿼리
         */
    }

    @Test
    void test2() {
        Users user = em.find(Users.class, 1L); // DB -> 영속성 컨택스트
        System.out.println(user);

        Users user2 = em.find(Users.class, 1L); // DB(X), 영속성 컨택스트
        System.out.println(user2);
    }

    @Test
    void test3() {
        Users user = em.find(Users.class, 1L);
        System.out.println(user);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        user.setUserNm("(수정)사용자01");
        Users user2 = em.find(Users.class, 1L);
        System.out.println(user2);
    }
}
