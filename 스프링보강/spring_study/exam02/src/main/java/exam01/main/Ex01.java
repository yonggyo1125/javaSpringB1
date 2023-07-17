package exam01.main;

import exam01.Greet;
import exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Greet g1 = ctx.getBean("greet", Greet.class);
        g1.hello("이이름");

        Greet g2 = ctx.getBean("greet", Greet.class);
        g2.hello("김이름");

        System.out.println(g1 == g2);

        ctx.close();
    }
}
