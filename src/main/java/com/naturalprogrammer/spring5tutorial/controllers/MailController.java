package com.naturalprogrammer.spring5tutorial.controllers;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * Created by MarcosNami on 9/30/2017.
 */
@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(MailSender smtp) {
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {
        mailSender.send("trupti.green@gmail.com", "A test mail", "Body of the test mail");
        return "Mail sent";
    }

}
