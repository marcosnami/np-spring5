package com.naturalprogrammer.spring5tutorial.controllers;

import com.naturalprogrammer.spring5tutorial.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;
import java.util.Optional;

/**
 * Created by MarcosNami on 9/30/2017.
 */
@Controller
public class WelcomeController {

    @Autowired
    private MessageSource messageSource;

    @Value("${application.message: Hello World}")
    private String message = "Hello World!";

    @RequestMapping("/welcome")
    public String welcome(Model model) {

        model.addAttribute("name",
                MessageUtils.getMessage("name", null));
        model.addAttribute("text",
                MessageUtils.getMessage("text", "http://below18.example.com", "http://over18.example.com"));

        return "welcome";
    }

    @RequestMapping("/welcome/{id}")
    public String welcomeId(Model model,
                            @PathVariable("id") int id,
                            // Not Optional
                            //@RequestParam("name") String name) {
                            // Optional 1st method
                            //@RequestParam(required = false, value = "name") String name) {
                            // Optional 2nd method, this method you can use .orElse in the addAttribute
                            @RequestParam("name") Optional<String> name) {

        model.addAttribute("id", id);
        model.addAttribute("name", name.orElse("Ana Paula"));

        return "welcome-id";
    }

    /*@RequestMapping("/welcome")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("name", "Marcos Nami");
        return modelAndView;
    }*/

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }
}
