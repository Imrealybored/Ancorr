package ancorr.model.employee;


public class EmployeeStatus
{
    private int employeeStatId;
    private int employeeId;
    private String employeeStatDesc;

    public int getEmployeeStatId()
    {
        return employeeStatId;
    }

    public void setEmployeeStatId(int employeeStatId)
    {
        this.employeeStatId = employeeStatId;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeStatDesc()
    {
        return employeeStatDesc;
    }

    public void setEmployeeStatDesc(String employeeStatDesc)
    {
        this.employeeStatDesc = employeeStatDesc;
    }
}
