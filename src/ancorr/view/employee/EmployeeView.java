package ancorr.view.employee;

import ancorr.controller.MainApplication;
import ancorr.model.employee.Employee;
import ancorr.model.employee.EmployeeSchedule;

import javax.swing.*;

/**
 * Created by fihgu on 11/6/2016.
 */
public class EmployeeView
{
    private JPanel mainPanel;
    private JTextField fristNameField;
    private JTextField lastNameField;
    private JComboBox positionComboBox;
    private JSpinner regularHourSpinner;
    private JSpinner spinner1;
    private JPanel employeeShiftListPanel;
    private JComboBox statusComboBox;
    private JCheckBox isSupervisorCheckBox;
    private JComboBox supervisorStatusComboBox;
    private JCheckBox isSystemUserCheckBox;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton confirmButton;
    private JButton cancelButton;

    private Employee employee;

    public EmployeeView(Employee employee)
    {
        this.employee = employee;
    }

    private void createUIComponents()
    {
        EmployeeSchedule schedule = MainApplication.getDatabaseAccess().getEmployeeSchedule(employee);
        employeeShiftListPanel = new EmployeeShiftListView(MainApplication.getDatabaseAccess().getEmployeeShifts(schedule)).getMainPanel();
    }
}
