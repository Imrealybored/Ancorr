package ancorr.controller;

import ancorr.controller.employee.LoginManager;
import ancorr.view.employee.LoginView;

import javax.swing.*;
import java.awt.*;

public class MainApplication
{
    private static IDatabaseAccess databaseAccess;
    private static JFrame mainFrame;

    static
    {
        //TODO: supply the mainApplication with the real databaseAccess object.
        databaseAccess = new TestDatabaseAccess();

        mainFrame = new JFrame("Ancorr");
        mainFrame.setMinimumSize(new Dimension(620,420));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void start()
    {
        setContent(new LoginView().getMainPanel());
        mainFrame.setVisible(true);
    }

    public static IDatabaseAccess getDatabaseAccess()
    {
        return databaseAccess;
    }

    public static void setContent(JPanel content)
    {
        mainFrame.setContentPane(content);
        mainFrame.pack();
    }
}
