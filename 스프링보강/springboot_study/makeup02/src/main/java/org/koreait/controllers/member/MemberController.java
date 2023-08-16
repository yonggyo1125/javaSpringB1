package org.koreait.controllers.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.models.member.MemberInfo;
import org.koreait.models.member.MemberSaveService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Slf4j
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

    @GetMapping("/info")
    @ResponseBody
    public void info() {
        MemberInfo memberInfo = (MemberInfo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        log.info(memberInfo.toString());
    }
    /**
    public void info(@AuthenticationPrincipal MemberInfo memberInfo) {
        log.info(memberInfo.toString());
    }
     */
    /**
    public void info(Principal principal) {
        String userId = principal.getName();
        log.info("userId : " + userId);

    }
     */
}
