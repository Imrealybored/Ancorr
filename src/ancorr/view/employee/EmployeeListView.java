package ancorr.view.employee;

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
        //TODO:
    }

    @Override
    public void onEdit()
    {

    }

    @Override
    public void onDelete()
    {

    }
}
