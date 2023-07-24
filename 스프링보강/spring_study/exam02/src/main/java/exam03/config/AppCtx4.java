package exam03.config;

import exam03.members.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("exam03.members")
public class AppCtx4 {
    @Bean
    public UserDao userDao() {
        System.out.println("수동 등록 빈!!");
        return new UserDao();
    }

}
