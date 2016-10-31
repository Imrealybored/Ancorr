package ancorr.model.project;

import java.sql.Date;

public class Project
{
    private int clientId;
    private int supervisorId;
    private int employeeId;
    private int projectStatCode;
    private Date projectStartDate;
    private Date projectEndDate;
    private String projectNotes;

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

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

    public int getProjectStatCode()
    {
        return projectStatCode;
    }

    public void setProjectStatCode(int projectStatCode)
    {
        this.projectStatCode = projectStatCode;
    }

    public Date getProjectStartDate()
    {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate)
    {
        this.projectStartDate = projectStartDate;
    }

    public Date getProjectEndDate()
    {
        return projectEndDate;
    }

    public void setProjectEndDate(Date projectEndDate)
    {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectNotes()
    {
        return projectNotes;
    }

    public void setProjectNotes(String projectNotes)
    {
        this.projectNotes = projectNotes;
    }
}
