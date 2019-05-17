package lv.sda.spring.springboot.controller;


import lv.sda.spring.springboot.entity.RegistrationFields;
import lv.sda.spring.springboot.repository.UsersRepository;
import lv.sda.spring.springboot.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RegistrationController {
    //This class will contain the methods responsible for handling incoming web requests

    UsersRepository usersRepository;

    public RegistrationController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    RegistrationService registrationService;

    @GetMapping("/registration") // = resources/templates/registration
    public String getRegistrationInfo(Model model) {
        model.addAttribute("registration_info", new RegistrationFields());
        //in registration_form we refer to THIS Object by its key name IN th:Object = "registration_info"
        return "registration/registration_form";
    }

    @PostMapping ("/registration")
    public String submitRegistrationInfo (RegistrationFields registrationFields, RedirectAttributes ra){

        //RegistrationFields result = this.usersRepository.save(registrationFields);
        //model.addAttribute("registration_info", new RegistrationFields());
        //model.addAttribute("submitted", true);

        this.usersRepository.save(registrationFields);
        return "redirect:/registration";
    }

    @GetMapping ("/allusers")
    public String getRegistratedUsersInfo (Model model) {
        model.addAttribute("users", this.usersRepository.findAllNotPrivateUsers());
        return "registration/registration_list";
    }
}
