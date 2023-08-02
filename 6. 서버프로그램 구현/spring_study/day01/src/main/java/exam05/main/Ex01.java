package exam05.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam05.config.AppCtx;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
    }
}
