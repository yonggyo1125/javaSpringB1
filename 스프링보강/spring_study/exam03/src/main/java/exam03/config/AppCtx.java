package exam03.config;

import exam03.aopex.Calculator;
import exam03.aopex.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy - 인터페이스 베이스 프록시
@EnableAspectJAutoProxy(proxyTargetClass = true) // 하위 클래스 기반 프록시
public class AppCtx {

    @Bean
    public CacheCalculator cacheCalculator() {
        return new CacheCalculator();
    }

    @Bean
    public ProxyCalculator proxyCalculator() {

        return new ProxyCalculator();
    }

    @Bean
    public Calculator calculator() {

        return new RecCalculator();
    }
}
