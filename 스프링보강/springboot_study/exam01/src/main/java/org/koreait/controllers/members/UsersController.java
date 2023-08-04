package org.koreait.controllers.members;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
    @GetMapping("/member/join")
    public String join() {
        System.out.println("소스 변경4!");
        return "member/join";
    }
}
