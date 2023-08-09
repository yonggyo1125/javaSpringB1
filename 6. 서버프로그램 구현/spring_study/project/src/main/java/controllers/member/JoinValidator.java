package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) { // 검증하고자 하는 커맨드 객체 제한
        return clazz.isAssignableFrom(JoinForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) { // 유효성 검사 진행
        JoinForm joinForm = (JoinForm)target;

        /** 필수 항목 검증 */
        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPw();
        String userNm = joinForm.getUserNm();
        String email = joinForm.getEmail();

        if (userId == null || userId.isBlank()) {
            errors.rejectValue("userId", "Required", "아이디를 입력하세요.");
        }

        if (userPw == null || userPw.isBlank()) {
            errors.rejectValue("userPw", "Required", "비밀번호를 입력하세요.");
        }

        if (userPwRe == null || userPwRe.isBlank()) {
            errors.rejectValue("userPwRe", "Required", "비밀번호를 확인하세요.");
        }

        if (userNm == null || userNm.isBlank()) {
            errors.rejectValue("userNm", "Required", "회원명을 입력하세요.");
        }

        if (email == null || email.isBlank()) {
            errors.rejectValue("email", "Required", "이메일을 입력하세요.");
        }

        boolean result = false;
        if (!result) {
            errors.reject("testError", "공통 오류 발생!!");
        }
    }
}
