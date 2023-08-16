package org.koreait.configs;

import org.koreait.models.member.MemberInfo;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {

        String userId = null;

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null && auth.getPrincipal() instanceof UserDetails) {
            //Object principal = auth.getPrincipal();
            // 비회원 - Anonymous 문자열
            // 로그인시 - UserDetails 구현 객체
            MemberInfo memberInfo = (MemberInfo)auth.getPrincipal();
            userId = memberInfo.getUserId();
        }

        return Optional.ofNullable(userId);
    }
}
