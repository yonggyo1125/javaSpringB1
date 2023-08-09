package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
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
        /*
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required");
        */
        /** 약관 동의 필수 여부 */
        /*
        if (!joinForm.isAgree()) {
            errors.rejectValue("agree", "Required");
        }
         */
    }
}
