package ancorr.model.employee;


public class Supervisor
{
    private int supervisorId;
    private int employeeId;
    private int supervisorStatCode;

    public int getSupervisorId()
    {
        return supervisorId;
    }

    public void setSupervisorId(int supervisorId)
    {
        this.supervisorId = supervisorId;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public int getSupervisorStatCode()
    {
        return supervisorStatCode;
    }

    public void setSupervisorStatCode(int supervisorStatCode)
    {
        this.supervisorStatCode = supervisorStatCode;
    }
}
