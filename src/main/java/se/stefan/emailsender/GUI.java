package se.stefan.emailsender;

import javax.swing.*;

public class GUI {

    private JPanel emailPanel;
    private JTextField mailAddressField;
    private JTextField subjectField;
    private JTextField messageTExtField;

    public GUI() {

        mailAddressField = new JTextField(20);
        subjectField = new JTextField(20);
        messageTExtField = new JTextField(20);

        emailPanel = new JPanel();
        emailPanel.add(new JLabel("Till: "));
        emailPanel.add(mailAddressField);
        emailPanel.add(Box.createHorizontalStrut(15));
        emailPanel.add(new JLabel("Ämne: "));
        emailPanel.add(subjectField);
        emailPanel.add(Box.createHorizontalStrut(15));
        emailPanel.add(new JLabel("Text: "));
        emailPanel.add(messageTExtField);
        emailPanel.add(Box.createHorizontalStrut(15));

    }

    public Email showEmailPanel() {

        int result = JOptionPane.showConfirmDialog(null, emailPanel,
                "Mail app", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String to = mailAddressField.getText();
            String subject = subjectField.getText();
            String message = messageTExtField.getText();


            mailAddressField.setText("");
            subjectField.setText("");
            messageTExtField.setText("");



            return new Email(to, subject, message);

        }

        return null;

    }








}
