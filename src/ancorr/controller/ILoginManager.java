package ancorr.controller;

import javax.swing.*;

public interface ILoginManager
{
    void login(String username, String password, JLabel responseLabel);

    void changePassword(String username, String oldPassword, String newPassword, String confirmPassword, JLabel responseLabel);

    String getCurrentUser();
}
