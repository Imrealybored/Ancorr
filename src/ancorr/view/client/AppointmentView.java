package ancorr.view.client;

import ancorr.controller.MainApplication;
import ancorr.model.client.Appointment;
import ancorr.model.client.Client;

import javax.swing.*;
import java.util.Date;

public class AppointmentView
{
    private JPanel mainPanel;
    private JButton confirmButton;
    private JButton cancelButton;
    private JComboBox<Client> clientComboBox;
    private JSpinner timeSpinner;
    private JTextField textField1;

    public AppointmentView( Appointment appointment)
    {
        //Add all clients into comboBox.
        MainApplication.getDatabaseAccess().getClients().forEach(client -> MainApplication.getDatabaseAccess().getClients());

        if(appointment != null)
        {
            //TODO:
        }
    }

    private void createUIComponents()
    {
        timeSpinner = new JSpinner( new SpinnerDateModel() );
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "MM/dd/yy - HH:mm:ss");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setValue(new Date());
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }

    public Appointment getAppointment()
    {
        //TODO:
        return null;
    }
}
