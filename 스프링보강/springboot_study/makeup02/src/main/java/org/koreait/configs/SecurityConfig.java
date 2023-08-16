package org.koreait.configs;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.models.member.LoginFailureHandler;
import org.koreait.models.member.LoginSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.io.IOException;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        /** 회원 인증 */
        http.formLogin(f -> {
            f.loginPage("/member/login")
                    .usernameParameter("userId")
                    .passwordParameter("userPw")
                    .successHandler(new LoginSuccessHandler())
                    .failureHandler(new LoginFailureHandler());
        });

        http.logout(f -> {
            f.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                    .logoutSuccessUrl("/member/login");
        });

        /* 회원 인가 */
        http.authorizeHttpRequests(f -> {
            f
                    .requestMatchers("/mypage/**").authenticated() // 회원 전용, 로그인한 사용자만 접근
                    .requestMatchers("/admin/**").hasAuthority("ADMIN") // 관리자
                    .anyRequest().permitAll(); // 나머지 경로는 전부 접근 가능
        });

        /* 페이지 접근 권한 없는 경우 상세 설정 */
        http.exceptionHandling(f -> {
           f.authenticationEntryPoint((req, res, e) ->  {
               String URI = req.getRequestURI();
               if (URI.indexOf("/mypage") != -1) { // mypage -> login
                    res.sendRedirect(req.getContextPath() + "/member/login");
               } else if (URI.indexOf("/admin") != -1) { // 관리자 페이지 401
                   res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "NOT AUTHORIZED");
               }
           });
        });

        return http.build();
    }

    /** Security 설정 배제 */
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return w -> w.ignoring().requestMatchers("/css/**", "/js/**", "/images/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }
}
