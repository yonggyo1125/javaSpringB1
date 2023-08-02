package exam02.config;

import exam02.models.member.JoinService;
import exam02.models.member.JoinValidator;
import exam02.models.member.MemberDao;
import exam02.models.member.MemberListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;

@Import(AppCtx3.class)
@Configuration
public class AppCtx2 {

    @Bean
    public JoinService joinService() {

        return new JoinService();
    }

    @Bean
    public JoinValidator joinValidator() {

        return new JoinValidator();
    }

    @Bean
    public MemberListService memberListService() {

        return new MemberListService();
    }

    //@Bean
    public DateTimeFormatter dateTimeFormatter() {
        return DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
    }
}
