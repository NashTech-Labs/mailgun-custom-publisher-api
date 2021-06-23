# Mailgun email publisher with JAVA

 Mailgun provides a web service for integrating email inboxes into apps. Just as Twilio enables developers to build voice and SMS into their apps, Mailgun enables developers to tightly integrate email into their apps, i.e. give real email mailboxes to their users, their web pages or any objects in their apps.

## Mailgun API: POST

```
"https://api.mailgun.net/v3/" + domain + "/messages"
```

## Application endpoint

You can send the email using postman using the below endpoint. The emails are hardcorded for now but will be made configurable in next iteration.

```
localhost:8080/send
```

## Configuration

There a set of environment variables to be provided before you run the application.

domain: This is the mailgun account 
domain api: This is the mailgun account API Key

