package lv.sda.spring.springboot.controller;


import lv.sda.spring.springboot.entity.RegistrationFields;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {
    //This class will contain the methods responsible for handling incoming web requests

    @GetMapping("/registration") // = resources/templates/registration
    public String getRegistrationInfo(Model model) {
        model.addAttribute("registrationfields", new RegistrationFields());
        //in registration_form we reffer to this Object by its key name = "registration_info"
        return "registration/registration_form";
    }

    @PostMapping ("/registration")
    public String submitRegistrationInfo (Model model, RegistrationFields registrationFields){
        model.addAttribute("registrationfields", new RegistrationFields());
        model.addAttribute("submitted", true);
        return "registration/registration_form";
    }

    @GetMapping ("/allusers")
    public String getRegistratedUsersInfo () {
        return "registration/registration_list";
    }
}
