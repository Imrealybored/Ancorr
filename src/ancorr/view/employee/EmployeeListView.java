package ancorr.view.employee;

import ancorr.controller.MainApplication;
import ancorr.model.employee.Employee;
import ancorr.view.ListView;

import java.util.List;

public class EmployeeListView extends ListView<Employee>
{
    public EmployeeListView(List<Employee> itemList)
    {
        super(itemList);
    }

    @Override
    public void onCreate()
    {
        MainApplication.setContent(new EmployeeView(new Employee()).getMainPanel());
    }

    @Override
    public void onEdit()
    {
        Employee employee = this.getSelectedItem();
        if(employee != null)
        {
            MainApplication.setContent(new EmployeeView(employee).getMainPanel());
        }
    }

    @Override
    public void onDelete()
    {
        Employee employee = this.getSelectedItem();
        if(employee != null)
        {
            this.itemList.remove(employee);
            MainApplication.getDatabaseAccess().deleteEmployee(employee.id);
            this.update();
        }
    }
}
