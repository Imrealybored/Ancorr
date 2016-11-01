package ancorr.view;

import javax.swing.*;

public class Menu
{
    JFrame mainFrame;
    private JPanel mainPanel;

    public Menu(JFrame mainFrame)
    {
        this.mainFrame = mainFrame;
        mainFrame.setContentPane(mainPanel);
        mainFrame.pack();
    }
}
