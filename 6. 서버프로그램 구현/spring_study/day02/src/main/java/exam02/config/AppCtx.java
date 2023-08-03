package exam02.config;

import exam02.aopex.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {
    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
