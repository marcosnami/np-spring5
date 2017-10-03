package com.naturalprogrammer.spring5tutorial.mail;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;
import com.naturalprogrammer.spring5tutorial.mail.MockMailSender;
import com.naturalprogrammer.spring5tutorial.mail.SmtpMailSender;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by MarcosNami on 9/30/2017.
 */
@Configuration
public class MailConfig {

    @Bean
    @ConditionalOnProperty(name="spring.mail.host",
            havingValue="foo", matchIfMissing=true)
    public MailSender mockMailSender() {

        return new MockMailSender();
    }

    @Bean
    @ConditionalOnProperty("spring.mail.host")
    public MailSender smtpMailSender(JavaMailSender javaMailSender) {

        return new SmtpMailSender(javaMailSender);
    }
}
