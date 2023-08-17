package org.koreait.controllers.board;

import org.koreait.commons.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/board/test")
    public String test() {
        boolean result = false;
        if (!result) {
            throw new CommonException("예외발생", HttpStatus.BAD_REQUEST);
        }

        return null;
    }
}
