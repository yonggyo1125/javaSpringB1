package controllers.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MemberController {
    @GetMapping("/member/info/{id}/{num}")
    public String info(@PathVariable(name="id", required = false) String userId,
                       @PathVariable int num) {
        System.out.printf("userId : %s, num=%d%n", userId, num);
        return "member/info";
    }

    @GetMapping("/member/list")
    public String list() {

        return "member/list";
    }
}
