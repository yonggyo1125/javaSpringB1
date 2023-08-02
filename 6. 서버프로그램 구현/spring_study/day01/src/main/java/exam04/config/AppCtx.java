package exam04.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "exam04.models",
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes=ManualBean.class))
public class AppCtx {
}
