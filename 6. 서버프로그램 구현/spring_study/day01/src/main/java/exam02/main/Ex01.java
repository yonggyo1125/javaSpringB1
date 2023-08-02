package exam02.main;

import exam02.config.AppCtx2;
import exam02.config.AppCtx3;
import exam02.models.member.JoinService;
import exam02.models.member.Member;
import exam02.models.member.MemberListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import exam02.config.AppCtx;

import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
       // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class, AppCtx3.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);
        JoinService joinService = ctx.getBean("joinService", JoinService.class);
        MemberListService listService = ctx.getBean("memberListService", MemberListService.class);

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
