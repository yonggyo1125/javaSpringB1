package exam03.main;

import exam03.aopex.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam03.config.AppCtx;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);
        long result = cal.factorial(10);
        System.out.println("cal : " + result);

        ctx.close();
    }
}
