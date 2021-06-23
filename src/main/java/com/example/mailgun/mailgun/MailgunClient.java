package com.example.mailgun.mailgun;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MailgunClient {

    @Value("${mailgun.domain}")
    private String domain;
    @Value("${mailgun.api}")
    private String api;

    public JsonNode sendEmailToMailgunMessage(String body) throws UnirestException {
        String email = "";
        HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + domain + "/messages")
                .basicAuth("api", api)
                .queryString("from", "Excited User <emailId>")
                .queryString("to", email)
                .queryString("subject", "Offer from team Ackerman")
                .queryString("text", body)
                .asJson();
        return request.getBody();
    }

}
