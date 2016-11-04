package ancorr;

import ancorr.controller.MainApplication;
import ancorr.view.client.AppointmentView;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        //TODO: supply the mainApplication with the real databaseAccess object.
        //MainApplication mainApplication = new MainApplication(null);

       // mainApplication.start();

        JFrame mainFrame = new JFrame("Ancorr");
        mainFrame.setMinimumSize(new Dimension(620,420));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setContentPane(new AppointmentView().getMainPanel());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
