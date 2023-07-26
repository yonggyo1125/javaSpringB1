package exam03.config;

import exam03.aopex.Calculator;
import exam03.aopex.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
