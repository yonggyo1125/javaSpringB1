package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="nm", required = false, defaultValue="이름 없음") String name, int num, boolean result) {
        System.out.printf("name=%s, num=%d, result=%s%n", name, num, result);
        return "hello";
    }

    /*
    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "이이름"); // EL식 속성
        mv.setViewName("hello");

        return mv;
    }
     */
}
