package exam01.config;

import exam01.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public Message message() {
        return new Message();
    }
}
