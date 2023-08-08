package controllers.member;

import models.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/join") // /member/join
    public String join(Model model) {
        model.addAttribute("title", "변경된 제목!");
        return "member/join"; // /WEB-INF/templates/member/join.html
    }

    @PostMapping("/join")
    public String joinPs(JoinForm joinForm) {
        System.out.println(joinForm);

        return "redirect:/member/login"; // 페이지 이동 응답헤더 : Location: 주소
    }

    @GetMapping("/info")
    public String info(Model model) {
        Member member = Member.builder()
                .userNo(1L)
                .userId("user01")
                .userPw("12345678")
                .userNm("사용자01")
                .email("user01@test.org")
                .mobile("01000000000")
                .regDt(LocalDateTime.now())
                .build();

        model.addAttribute("member", member);

        return "member/info"; // /WEB-INF/template/member/info.html
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Member> members = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Member member = Member.builder()
                    .userNo(i)
                    .userId("user" + i)
                    .userPw("12345678")
                    .userNm("사용자" + i)
                    .email("user" + i + "@test.org")
                    .mobile("01000000000")
                    .regDt(LocalDateTime.now())
                    .build();
            members.add(member);
        }

        return "member/list";
    }
}
