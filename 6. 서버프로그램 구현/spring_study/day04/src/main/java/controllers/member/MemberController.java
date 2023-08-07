package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/join") // /member/join
    public String join() {

        return "member/join"; // /WEB-INF/view/member/join.jsp
    }

    @PostMapping("/join")
    public String joinPs(JoinForm joinForm) {
        System.out.println(joinForm);

        return "redirect:/member/login"; // 페이지 이동 응답헤더 : Location: 주소
    }
}
