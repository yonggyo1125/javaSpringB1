package org.koreait.exam01;

import jakarta.persistence.EntityManager;
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

    @Test
    void test1() {
        Users users = new Users();
        users.setUserNo(1L);
        users.setUserId("user01");
        users.setUserPw("12345678");
        users.setUserNm("사용자01");
        users.setEmail("user01@test.org");
        users.setMobile("0100000");

        em.persist(users); // 영속성에 추가 
        em.flush(); // 쿼리 수행
    }
}
