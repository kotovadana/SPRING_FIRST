package lv.sda.spring.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {
    //This class will contain the methods responsible for handling incoming web requests

    @GetMapping("/registration")
    @ResponseBody
    public String getRegistrationInfo() {
        return "firstpage/registration_form";
    }

    @PostMapping ("/registration")
    @ResponseBody
    public String submitRegistrationInfo (){
        return "firstpage/registration_form";
    }

    @GetMapping ("/firstpage")
    @ResponseBody
    public String getRegistratedUsersInfo () {
        return "firstpage/registration_list";
    }
}
