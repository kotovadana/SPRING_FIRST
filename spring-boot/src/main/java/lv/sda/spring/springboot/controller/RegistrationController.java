package lv.sda.spring.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {
    //This class will contain the methods responsible for handling incoming web requests

    @GetMapping("/registration") // = resources/templates/registration
    public String getRegistrationInfo() {
        return "registration/registration_form";
    }

    @PostMapping ("/registration")
    public String submitRegistrationInfo (){
        return "registration/registration_form";
    }

    @GetMapping ("/firstpage")
    public String getRegistratedUsersInfo () {
        return "registration/registration_list";
    }
}
