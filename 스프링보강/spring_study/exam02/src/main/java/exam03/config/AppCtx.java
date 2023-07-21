package exam03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import exam03.members.*;

@Configuration
public class AppCtx {

    @Bean
    public UserDao userDao() {

        return new UserDao();
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(userDao());
    }

    @Bean
    public ListService listService() {
        ListService listService = new ListService();
        listService.setUserDao(userDao());

        return listService;
    }
}
