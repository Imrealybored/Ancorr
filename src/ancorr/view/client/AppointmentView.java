package ancorr.view.client;

import javax.swing.*;
import java.util.Date;

/**
 * Created by fihgu on 11/4/2016.
 */
public class AppointmentView
{
    private JPanel mainPanel;
    private JButton confirmButton;
    private JButton cancelButton;
    private JComboBox clientComboBox;
    private JSpinner timeSpinner;

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
}
