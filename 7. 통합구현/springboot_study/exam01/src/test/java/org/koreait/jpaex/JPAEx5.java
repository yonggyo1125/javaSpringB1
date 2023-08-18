package org.koreait.jpaex;

import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class JPAEx5 {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;

}
