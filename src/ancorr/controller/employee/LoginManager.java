package ancorr.controller.employee;

import ancorr.controller.MainApplication;
import ancorr.model.employee.SystemUser;
import ancorr.view.MenuView;

import javax.swing.*;
import java.awt.*;

public class LoginManager
{
    private static String currentUser;

    public static void login(String username, String password, JLabel responseLabel)
    {
        if(MainApplication.getDatabaseAccess().getSystemUser(username, password) != null)
        {
            currentUser = username;
            MainApplication.setContent(new MenuView().getMainPanel());
        }
        else
        {
            responseLabel.setForeground(Color.RED);
            responseLabel.setText("Invalid username or password!");
        }
    }

    public static void changePassword(String username, String oldPassword, String newPassword, String confirmPassword, JLabel responseLabel)
    {
        SystemUser user = MainApplication.getDatabaseAccess().getSystemUser(username, oldPassword);

        if (user != null)
        {
            if (newPassword.equals(confirmPassword))
            {
                user.password = newPassword;
                MainApplication.getDatabaseAccess().setSystemUser(user);

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

    public static String getCurrentUser()
    {
        return currentUser;
    }
}
