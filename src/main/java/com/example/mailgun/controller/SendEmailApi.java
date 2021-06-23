package com.example.mailgun.controller;

import com.example.mailgun.processor.Publisher;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class SendEmailApi {

    private final Publisher publisher;

    public SendEmailApi(Publisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping(path = "/send")
    public void sendEmail(@RequestBody String body) throws UnirestException {
        publisher.sendmail(body);
    }
}
