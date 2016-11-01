package ancorr;

import ancorr.view.Login;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame mainFrame = new JFrame("Ancorr");
        mainFrame.setMinimumSize(new Dimension(620,420));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        new Login(mainFrame);
    }
}
