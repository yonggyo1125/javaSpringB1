package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    /*
    @GetMapping("/hello")
    public String hello() {

        return "hello"; // /WEB-INF/view/hello.jsp
    }

     */

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "이이름"); // EL식 속성
        mv.setViewName("hello");

        return mv;
    }
}
