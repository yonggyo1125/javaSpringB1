package controllers.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/join")
@RequiredArgsConstructor
public class JoinController {

    private final JoinValidator joinValidator;

    @GetMapping
    public String join() {

        return "member/join";
    }

    @PostMapping
    public String joinPs(JoinForm form, Errors errors) {

        joinValidator.validate(form, errors);

        if (errors.hasErrors()) {
            return "member/join";
        }

        return "redirect:/member/login";
    }
}
