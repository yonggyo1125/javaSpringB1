package exam03.main;

import exam03.config.AppCtx2;
import exam03.members.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam03.config.AppCtx;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);
        JoinService joinService = ctx.getBean("joinService", JoinService.class);
        ListService listService = ctx.getBean("listService", ListService.class);

        Users user = new Users();
        user.setUserId("user01");
        user.setUserPw("1234");
        user.setUserNm("사용자01");
        user.setRegDt(LocalDateTime.now());

        joinService.join(user);
        listService.print();

        ctx.close();
    }
}
