package exam02.config;

import exam02.models.member.JoinService;
import exam02.models.member.JoinValidator;
import exam02.models.member.MemberDao;
import exam02.models.member.MemberListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

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
}
