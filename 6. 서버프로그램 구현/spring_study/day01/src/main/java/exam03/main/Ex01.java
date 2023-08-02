package exam03.main;

import exam03.models.member.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam03.config.AppCtx;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        JoinService joinService = ctx.getBean(JoinService.class);
        MemberListService listService = ctx.getBean(MemberListService.class);

        Member member = Member.builder()
                .userId("user01")
                .userPw("12345678")
                .userPwRe("12345678")
                .userNm("사용자01")
                .agree(true)
                .regDt(LocalDateTime.now())
                .build();

        joinService.join(member);

        listService.print();
        ctx.close();
    }
}
