package org.koreait.commons;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONData<T> {
    private boolean success;
    private String message;
    private HttpStatus status;
    private T data;
}
