package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @GetMapping("/member/join")
    public String join() {

        return "member/join"; // /WEB-INF/view/member/join.jsp
    }

    @PostMapping("/member/join")
    public String joinPs() {
        System.out.println("POST 유입!");
        return null;
    }
}
