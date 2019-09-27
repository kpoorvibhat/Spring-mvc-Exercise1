package com.stackroute;

import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String displayName(Model model) {
        User user = new User("Poorvi");
        System.out.println(user.getName());
        model.addAttribute("user", user.getName());
        return "index";
    }

}
