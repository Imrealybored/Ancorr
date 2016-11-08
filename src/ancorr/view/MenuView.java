package ancorr.view;

import ancorr.controller.MainApplication;
import ancorr.view.client.AppointmentListView;
import ancorr.view.employee.EmployeeListView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuView
{
    private JPanel mainPanel;
    private JButton employeeButton;
    private JButton clientButton;
    private JButton vendorButton;
    private JButton materialsButton;
    private JButton equipmentButton;
    private JButton projectButton;
    private JButton appointmentButton;
    private JButton transactionButton;

    public MenuView( )
    {
        appointmentButton.addActionListener(e -> MainApplication.setContent(new AppointmentListView(MainApplication.getDatabaseAccess().getAppointments()).getMainPanel()));
        employeeButton.addActionListener(e -> MainApplication.setContent(new EmployeeListView(MainApplication.getDatabaseAccess().getEmployees()).getMainPanel()));
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
