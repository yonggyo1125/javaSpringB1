package controllers.member;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.member.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public String login() {

        loginService.login();

        return "member/login";
    }

    @PostMapping
    public String loginPs() {

        return "redirect:/mypage";
    }
}
