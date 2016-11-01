package ancorr.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by fihgu on 10/31/2016.
 */
public class Login
{
    private JPanel mainPanel;
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

    private JFrame mainFrame;

    public Login(JFrame mainFrame)
    {
        this.mainFrame = mainFrame;
        this.mainFrame.setContentPane(this.mainPanel);
        this.mainFrame.pack();

        /**
         * copy login user name to change password password field when tab changes.
         */
        tabPanel.addChangeListener(event -> changePasswordUsernameField.setText(loginUsernameField.getText()));


        confirmButton.addActionListener(event ->
        {
            String username = changePasswordUsernameField.getText();
            String oldPassword = new String(oldPasswordField.getPassword());
            String newPassword = new String(newPasswordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if(changePassword(username,oldPassword, newPassword, confirmPassword))
            {
                changePasswordResponseLabel.setForeground(Color.GREEN);
                changePasswordResponseLabel.setText("Password changed.");
            }
            else
            {
                changePasswordResponseLabel.setForeground(Color.RED);
                changePasswordResponseLabel.setText("Could not change password!");
            }
        });

        loginButton.addActionListener(e ->
        {
            String username = loginUsernameField.getText();
            String password = new String(loginPasswordField.getPassword());
            if(login(username,password))
            {
                new Menu(mainFrame);
            }
            else
            {
                loginResponseLabel.setText("Wrong username or password!");
            }
        });
    }

    /**
     * @return true if the password and username are valid.
     */
    private boolean login(String username, String password)
    {
        //TODO: check the username and password.
        if(!username.equals("admin"))
        {
            //TODO: remove this test case.
            return false;
        }

        return true;
    }

    /**
     * @return true if the password change can be done.
     */
    private boolean changePassword(String username, String oldPassword, String newPassowrd, String confirmPassword)
    {
        if(login(username, oldPassword) && newPassowrd.equals(confirmPassword))
        {
            //TODO: actually change the password here.
            return true;
        }

        return false;
    }
}
