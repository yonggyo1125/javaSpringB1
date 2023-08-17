package org.koreait.restcontrollers;

import org.koreait.commons.CommonException;
import org.koreait.commons.JSONData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("org.koreait.restcontrollers")
public class CommonRestController {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData<Object>> errorHandler(Exception e) {
        JSONData<Object> jsonData = new JSONData<>();
        jsonData.setMessage(e.getMessage());

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException) {
            CommonException e2 = (CommonException)e;
            status = e2.getStatus();
        }

        jsonData.setStatus(status);

        return ResponseEntity.status(status).body(jsonData);
    }
}
