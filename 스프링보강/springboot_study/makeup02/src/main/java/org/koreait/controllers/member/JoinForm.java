package org.koreait.controllers.member;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JoinForm {
    @NotBlank(message="아이디를 입력하세요.")
    private String userId;

    @NotBlank(message="비밀번호를 입력하세요.")
    private String userPw;

    @NotBlank(message="비밀번호를 확인하세요.")
    private String userPwRe;

    @NotBlank(message="회원명을 입력하세요.")
    private String userNm;
}