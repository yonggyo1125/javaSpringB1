package exam01.main;

import exam01.Message2;
import exam01.config.AppCtx2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);
        Message2 m1 = ctx.getBean(Message2.class);
        Message2 m2 = ctx.getBean(Message2.class);
        System.out.println(m1 == m2);
        ctx.close();
    }
}
