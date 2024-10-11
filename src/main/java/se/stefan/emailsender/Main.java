package se.stefan.emailsender;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        SendEmail newEmail = new SendEmail("din@gmail.com", "din appkod ");

        GUI gui = new GUI();

        while (true) {

            Email email = gui.showEmailPanel();

            if (email != null) {

                newEmail.sendEmail(email.getTo(), email.getSubject(), email.getMessage());

                System.out.println(email.getTo() + ", " + email.getSubject() + ", "
                        + email.getMessage());

            } else if (email == null) {
                break;
            }


        }


    }


}
