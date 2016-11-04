package ancorr.view;

import ancorr.controller.MainApplication;

import javax.swing.*;

public class MenuView
{
    private final MainApplication mainApplication;

    private JPanel mainPanel;
    private JButton employeeButton;
    private JButton clientButton;
    private JButton vendorButton;
    private JButton materialsButton;
    private JButton equipmentButton;
    private JButton projectButton;
    private JButton appointmentButton;
    private JButton transactionButton;

    public MenuView(MainApplication mainApplication)
    {
        this.mainApplication = mainApplication;
    }
}
