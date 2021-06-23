package com.example.mailgun.processor;

import com.example.mailgun.mailgun.MailgunClient;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    private final MailgunClient mailgunClient;

    public Publisher(MailgunClient mailgunClient) {
        this.mailgunClient = mailgunClient;
    }

    public void sendmail(String body) throws UnirestException {
        mailgunClient.sendEmailToMailgunMessage(body);
    }
}
