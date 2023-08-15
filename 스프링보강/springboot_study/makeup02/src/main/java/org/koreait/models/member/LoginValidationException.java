package org.koreait.models.member;

import lombok.Getter;

@Getter
public class LoginValidationException extends RuntimeException {
    private String field;

    public LoginValidationException(String field, String message) {
        super(message);

        this.field = field;
    }
}
