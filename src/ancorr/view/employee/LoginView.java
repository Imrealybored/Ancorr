package ancorr.view.employee;

import ancorr.controller.employee.LoginManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView
{
    final LoginManager loginManager;

    private JTabbedPane tabPanel;
    private JLabel loginResponseLabel;
    private JPasswordField loginPasswordField;
    private JTextField loginUsernameField;
    private JButton loginButton;
    private JTextField changePasswordUsernameField;
    private JPasswordField oldPasswordField;
    private JPasswordField newPasswordField;
    private JPasswordField confirmPasswordField;
    private JButton confirmButton;
    private JLabel changePasswordResponseLabel;

    private JPanel mainPanel;

    public LoginView(LoginManager loginManager)
    {
        this.loginManager = loginManager;

        //copy login user name to change password password field when tab changes.
        tabPanel.addChangeListener(event -> changePasswordUsernameField.setText(loginUsernameField.getText()));


        confirmButton.addActionListener(event ->
        {
            String username = changePasswordUsernameField.getText();
            String oldPassword = new String(oldPasswordField.getPassword());
            String newPassword = new String(newPasswordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            loginManager.changePassword(username,oldPassword,newPassword,confirmPassword,changePasswordResponseLabel);
        });

        loginButton.addActionListener(e ->
        {
            String username = loginUsernameField.getText();
            String password = new String(loginPasswordField.getPassword());

            loginManager.login(username, password, loginResponseLabel);
        });
        loginPasswordField.addActionListener(e -> loginButton.doClick());
        loginUsernameField.addActionListener(e -> loginPasswordField.grabFocus());
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
