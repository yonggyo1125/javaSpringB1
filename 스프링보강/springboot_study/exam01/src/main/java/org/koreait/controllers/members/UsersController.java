package org.koreait.controllers.members;

import org.koreait.models.member.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class UsersController {
    @GetMapping("/member/join")
    public String join(Model model) {
        model.addAttribute("title", "제목!!");
        return "member/join"; // resources/templates/member/join.html
    }

    @GetMapping("/member/info")
    public String info(Model model) {
        Users user = Users.builder()
                .userNo(1L)
                .userId("user01")
                .userNm("사용자01")
                .email("user01@test.org")
                .regDt(LocalDateTime.now())
                .build();

        model.addAttribute("user", user);
        return "member/info";
    }
}
