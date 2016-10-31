package ancorr.model.employee;


public class EmployeeJobHistory
{
    private int historyID;
    private String duties;
    private int employeeID;
    private String employeeEvaluation;

    public int getHistoryID()
    {
        return historyID;
    }

    public void setHistoryID(int historyID)
    {
        this.historyID = historyID;
    }

    public String getDuties()
    {
        return duties;
    }

    public void setDuties(String duties)
    {
        this.duties = duties;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public String getEmployeeEvaluation()
    {
        return employeeEvaluation;
    }

    public void setEmployeeEvaluation(String employeeEvaluation)
    {
        this.employeeEvaluation = employeeEvaluation;
    }
}
