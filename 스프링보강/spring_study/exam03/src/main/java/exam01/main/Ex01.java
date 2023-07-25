package exam01.main;

import exam01.Message;
import exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message message = ctx.getBean(Message.class);
        message.send("이이름");

        ctx.close();
    }
}
