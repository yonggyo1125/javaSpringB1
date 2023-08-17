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
@TestPropertySource(locations = "classpath:application-test.properties")
public class JPAEx1 {
    @PersistenceContext // @Autowired와 동일 역할
    private EntityManager em;

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
    }
}
