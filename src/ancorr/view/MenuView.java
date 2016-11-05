package ancorr.view;

import ancorr.controller.MainApplication;
import ancorr.view.client.AppointmentListView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        appointmentButton.addActionListener(e -> mainApplication.setContent(new AppointmentListView(mainApplication.getDatabaseAccess().getAppointments()).getMainPanel()));
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
