package exam02.main;

import exam02.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam02.aopex.*;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        Calculator cal = ctx.getBean(Calculator.class);

        ctx.close();
    }
}
