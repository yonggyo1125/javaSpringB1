package exam05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import exam05.Message;

@Configuration
public class AppCtx {

    @Bean
    public Message message() {
        return new Message();
    }
}
