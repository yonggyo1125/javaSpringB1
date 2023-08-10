package models.members;

import controllers.member.LoginForm;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginValidator loginValidator;
    private final HttpSession session;
    private final MemberDao memberDao;

    public void login(LoginForm loginForm, Errors errors) {

        loginValidator.validate(loginForm, errors);

        if (errors.hasErrors()) { // 기본 검증 실패시
            return;
        }
        
        // 검증 성공시 로그인 처리
        String userId = loginForm.getUserId();
        Member member = memberDao.get(userId);
        session.setAttribute("member", member);
    }
}
