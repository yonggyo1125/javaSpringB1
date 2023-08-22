package org.koreait.controllers.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.models.member.MemberSaveService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberSaveService saveService;

    @GetMapping("/join")
    public String join(@ModelAttribute JoinForm joinForm) {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid JoinForm joinForm, Errors errors) {

        if (errors.hasErrors()) {
            return "member/join";
        }

        saveService.save(joinForm);

        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login() {

        return "member/login";
    }
}
