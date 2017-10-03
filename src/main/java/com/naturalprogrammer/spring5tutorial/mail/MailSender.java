package com.naturalprogrammer.spring5tutorial.mail;

import javax.mail.MessagingException;

/**
 * Created by MarcosNami on 9/30/2017.
 */
public interface MailSender {
    void send(String to, String subject, String body) throws MessagingException;
}