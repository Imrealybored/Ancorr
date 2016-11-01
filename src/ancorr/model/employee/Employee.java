package ancorr.model.employee;


public class Employee
{
    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private boolean isSupervisor;
    private boolean isSystemUser;

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName()
    {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName)
    {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName()
    {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName)
    {
        this.employeeLastName = employeeLastName;
    }

    public boolean isSupervisor()
    {
        return isSupervisor;
    }

    public void setSupervisor(boolean supervisor)
    {
        isSupervisor = supervisor;
    }

    public boolean isSystemUser()
    {
        return isSystemUser;
    }

    public void setSystemUser(boolean systemUser)
    {
        isSystemUser = systemUser;
    }
}
