package org.koreait.controllers.member;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
    public String join(@ModelAttribute JoinForm joinForm) {
        return "member/join";
    }

    public String joinPs(@Valid JoinForm joinForm, Errors errors) {

        if (errors.hasErrors()) {
            return "member/join";
        }

        return "redirect:/member/login";
    }
}
