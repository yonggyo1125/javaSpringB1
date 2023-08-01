package exam01.main;

import exam01.Hello;
import exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Hello hello = ctx.getBean("hello", Hello.class);
        hello.message("이이름");

        Hello hello2 = ctx.getBean("hello", Hello.class);
        System.out.println(hello == hello2);

        ctx.close();
    }
}
