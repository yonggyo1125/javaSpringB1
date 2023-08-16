package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {
    private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

    public CommonException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
