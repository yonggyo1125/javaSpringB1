package org.koreait.exam01;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(locations="classpath:application-test.properties")
public class JPAEx1 {

    @Autowired
    private EntityManager em;

    private Users users;

    @BeforeEach
    void init() {
        Users users = new Users();
        users.setUserNo(1L);
        users.setUserId("user01");
        users.setUserPw("12345678");
        users.setUserNm("사용자01");
        users.setEmail("user01@test.org");
        users.setMobile("0100000");

        em.persist(users); // 영속성에 추가 - 변화 감지
        em.flush(); // 쿼리 수행
        //em.detach(users);
    }

    @Test
    void test1() {
        em.detach(users); // 영속성 분리 - 변화 감지 X

        users.setUserNm("(수정)사용자01");
        em.flush();

        em.merge(users); // 분리된 영속성 -> 영속 상태 - 변화 감지
        em.flush();

        //em.remove(users); // 영속 상태 : 제거 상태
        //em.flush();
    }

    @Test
    void test2() {
        Users users2 = em.find(Users.class, 1L);
        System.out.println(users2);

        Users users3 = em.find(Users.class, 1L);
        System.out.println(users3);
    }

    @Test
    void test3() {
        Users users = new Users();
        users.setUserNo(2L);
        users.setUserId("user01");
        users.setUserPw("12345678");
        users.setUserNm("사용자01");
        users.setEmail("user01@test.org");
        users.setMobile("0100000");

        em.persist(users); // 영속성에 추가 - 변화 감지
        em.flush();

        users.setUserNm("(수정)사용자01");
        em.remove(users);

        Users users2 = em.find(Users.class, 2L); // flush() -> select
        System.out.println(users2);
    }
}
