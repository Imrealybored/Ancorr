package ancorr.controller.employee;

import ancorr.controller.MainApplication;
import ancorr.model.employee.SystemUser;
import ancorr.view.MenuView;

import javax.swing.*;
import java.awt.*;

public class LoginManager implements ILoginManager
{
    private String currentUser;
    private final MainApplication mainApplication;

    public LoginManager(MainApplication mainApplication)
    {
        this.mainApplication = mainApplication;
    }

    public void login(String username, String password, JLabel responseLabel)
    {
        if(mainApplication.getDatabaseAccess().getSystemUser(username, password) != null)
        {
            this.currentUser = username;
            mainApplication.setContent(new MenuView(mainApplication).getMainPanel());
        }
        else
        {
            responseLabel.setForeground(Color.RED);
            responseLabel.setText("Invalid username or password!");
        }
    }

    public void changePassword(String username, String oldPassword, String newPassword, String confirmPassword, JLabel responseLabel)
    {
        SystemUser user = mainApplication.getDatabaseAccess().getSystemUser(username, oldPassword);
        if (user != null)
        {
            if (newPassword.equals(confirmPassword))
            {
                user.password = newPassword;
                mainApplication.getDatabaseAccess().setSystemUser(user);

                responseLabel.setForeground(Color.GREEN);
                responseLabel.setText("Password changed!");
            } else
            {
                responseLabel.setForeground(Color.RED);
                responseLabel.setText("Confirm password does not match new password!");
            }
        } else
        {
            responseLabel.setForeground(Color.RED);
            responseLabel.setText("Invalid username or password!");
        }
    }

    public String getCurrentUser()
    {
        return this.currentUser;
    }
}
