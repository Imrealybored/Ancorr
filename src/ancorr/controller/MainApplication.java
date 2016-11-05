package ancorr.controller;

import ancorr.controller.employee.LoginManager;
import ancorr.view.employee.LoginView;

import javax.swing.*;
import java.awt.*;

public class MainApplication
{
    private final IDatabaseAccess databaseAccess;
    private final JFrame mainFrame;
    private final LoginManager loginManager;

    public MainApplication(IDatabaseAccess databaseAccess)
    {
        this.databaseAccess = databaseAccess;

        mainFrame = new JFrame("Ancorr");
        mainFrame.setMinimumSize(new Dimension(620,420));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        loginManager = new LoginManager(this);
    }

    public void start()
    {
        setContent(new LoginView(loginManager).getMainPanel());
        mainFrame.setVisible(true);
    }

    public IDatabaseAccess getDatabaseAccess()
    {
        return databaseAccess;
    }

    public void setContent(JPanel contentPanel)
    {
        mainFrame.setContentPane(contentPanel);
        mainFrame.pack();
    }

    public LoginManager getLoginManager()
    {
        return loginManager;
    }
}
