package com.naturalprogrammer.spring5tutorial.controllers;

import com.naturalprogrammer.spring5tutorial.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by MarcosNami on 9/30/2017.
 */
@Controller
public class SignupController {

    private static Log log = LogFactory.getLog(SignupController.class);

    @GetMapping("/signup")
    public String signup(Model model) {

        log.info("Method GET");
        model.addAttribute(new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String doSignup(@Validated User user, BindingResult result) {

        if (result.hasErrors())
            return "signup";

        log.info("Email: " + user.getEmail() + ", Name: " + user.getName() + ", Password: " + user.getPassword());

        return "redirect:/";
    }

}
