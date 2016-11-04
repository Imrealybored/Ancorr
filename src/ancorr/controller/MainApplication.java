package ancorr.controller;

import ancorr.view.LoginView;

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
        mainFrame.setContentPane(new LoginView(loginManager).getMainPanel());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public IDatabaseAccess getDatabaseAccess()
    {
        return databaseAccess;
    }

    public JFrame getMainFrame()
    {
        return mainFrame;
    }

    public LoginManager getLoginManager()
    {
        return loginManager;
    }
}
