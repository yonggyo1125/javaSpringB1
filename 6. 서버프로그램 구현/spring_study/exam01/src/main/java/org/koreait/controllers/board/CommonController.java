package org.koreait.controllers.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CommonController {

    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model, HttpServletResponse response, HttpServletRequest request) {
        e.printStackTrace();
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        if (e instanceof CommonException) {
            CommonException e2 = (CommonException)e;
            status = e2.getStatus();
        }

        int statusCode = status.value();

        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", status.toString() + "(" + statusCode + ")");
        model.addAttribute("path", request.getRequestURI());
        model.addAttribute("method", request.getMethod());
        model.addAttribute("timestamp", LocalDateTime.now().toString());

        return "error/common";
    }
}
