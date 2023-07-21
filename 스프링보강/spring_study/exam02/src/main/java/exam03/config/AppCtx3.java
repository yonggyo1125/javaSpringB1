package exam03.config;

import exam03.members.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx3 {
    @Bean
    @Qualifier("userDao1")
    public UserDao userDao() {

        return new UserDao();
    }

    @Bean
    @Qualifier("userDao2")
    public UserDao userDao2() {
        return new UserDao();
    }
}
