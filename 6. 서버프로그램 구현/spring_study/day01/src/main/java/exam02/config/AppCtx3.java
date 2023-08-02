package exam02.config;

import exam02.models.member.MemberDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx3 {
    @Bean
    //@Qualifier("memberDao1")
    public MemberDao memberDao() {

        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2() {
        return new MemberDao();
    }
}
