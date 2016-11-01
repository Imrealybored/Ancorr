package ancorr.model.employee;


public class Position
{
    private int positionId;
    private String positionTitle;
    private String positionDesc;
    private int employeeId;

    public int getPositionId()
    {
        return positionId;
    }

    public void setPositionId(int positionId)
    {
        this.positionId = positionId;
    }

    public String getPositionTitle()
    {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle)
    {
        this.positionTitle = positionTitle;
    }

    public String getPositionDesc()
    {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc)
    {
        this.positionDesc = positionDesc;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }
}
