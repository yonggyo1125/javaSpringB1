package exam01.config;

import exam01.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx2 {

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "close")
    public Message2 message2() {
        return new Message2();
    }
}
