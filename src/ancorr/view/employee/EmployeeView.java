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
    private JPanel benefitPanel;
    private JPanel jobHistoryPanel;
    private JPanel payrollPanel;

    private Employee employee;

    public EmployeeView(Employee employee)
    {
        this.employee = employee;
    }

    private void createUIComponents()
    {
        EmployeeSchedule schedule;
        if(employee.scheduleId != null)
        {
            schedule = MainApplication.getDatabaseAccess().getEmployeeSchedule(employee.scheduleId);
        }
        else
        {
            schedule = new EmployeeSchedule();
        }

        employeeShiftListPanel = new EmployeeShiftListView(MainApplication.getDatabaseAccess().getEmployeeShifts(schedule)).getMainPanel();
        benefitPanel = new EmployeeBenefitListView(MainApplication.getDatabaseAccess().getEmployeeBenefits(employee)).getMainPanel();
        jobHistoryPanel = new EmployeeJobHistoryListView(MainApplication.getDatabaseAccess().getEmployeeJobHistories(employee)).getMainPanel();
        payrollPanel = new PayrollListView(MainApplication.getDatabaseAccess().getPayrolls(employee)).getMainPanel();
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
