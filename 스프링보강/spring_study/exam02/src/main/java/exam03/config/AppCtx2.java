package exam03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import exam03.members.*;

@Configuration
public class AppCtx2 {
    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public JoinService joinService() {
        return new JoinService();
    }

    @Bean
    public ListService listService() {
        return new ListService();
    }
}
