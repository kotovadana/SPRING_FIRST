package lv.sda.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/endpoint")
    @ResponseBody
    String exampleMethod() {
        return "Hello There...So the Spring s.hould understand this as a reference" +
                "to html file in 'template' folder, but because of annotation" +
                "'@ResponseBody' - Spring returns only this String";
    }
}
