
import javax.swing.*;
import java.awt.*;

public class LoginPage {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        
        JLabel title = new JLabel("Welcome to My Application");
        JLabel title = new JLabel("User Login");
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");

        panel.add(title);
        panel.add(new JLabel(""));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(loginButton);
        panel.add(clearButton);


        frame.add(panel);
        frame.setVisible(true);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("12345")) {
                JOptionPane.showMessageDialog(frame,
                    "Login Successful! Welcome " + username);
            } else {
                JOptionPane.showMessageDialog(frame,
                    "Invalid Username or Password!");
            }
        });
    }
}
