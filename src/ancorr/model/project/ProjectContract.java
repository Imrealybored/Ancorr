package ancorr.model.project;

import java.sql.Date;

public class ProjectContract
{
    private int projectContractId;
    private String projectContractDesc;
    private int projectId;
    private Date contractStartDate;
    private Date contractEndDate;

    public int getProjectContractId()
    {
        return projectContractId;
    }

    public void setProjectContractId(int projectContractId)
    {
        this.projectContractId = projectContractId;
    }

    public String getProjectContractDesc()
    {
        return projectContractDesc;
    }

    public void setProjectContractDesc(String projectContractDesc)
    {
        this.projectContractDesc = projectContractDesc;
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }

    public Date getContractStartDate()
    {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate)
    {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate()
    {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate)
    {
        this.contractEndDate = contractEndDate;
    }
}
