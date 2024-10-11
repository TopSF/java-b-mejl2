package se.stefan.emailsender;

public class Email {

    private String to;
    private String subject;
    private String message;

    public Email(String to, String subject, String messageText) {
        this.to = to;
        this.subject = subject;
        this.message = messageText;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }
}
