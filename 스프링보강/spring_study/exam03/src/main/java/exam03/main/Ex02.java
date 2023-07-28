package exam03.main;

import exam03.aopex.*;
import exam03.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        Calculator cal = ctx.getBean(Calculator.class);
        long result = cal.factorial(10);
        System.out.println(result);

        result = cal.factorial(10);
        System.out.println(result);

        result = cal.factorial(10);
        System.out.println(result);

        result = cal.factorial(10);
        System.out.println(result);

        result = cal.factorial(10);
        System.out.println(result);

        result = cal.factorial(10);
        System.out.println(result);

        ctx.close();
    }
}
