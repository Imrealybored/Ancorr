package ancorr.model.project;


public class ProjectHistory
{
    private int historyId;
    private int projectId;
    private String projectDesc;
    private String projectLength;

    public int getHistoryId()
    {
        return historyId;
    }

    public void setHistoryId(int historyId)
    {
        this.historyId = historyId;
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectDesc()
    {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc)
    {
        this.projectDesc = projectDesc;
    }

    public String getProjectLength()
    {
        return projectLength;
    }

    public void setProjectLength(String projectLength)
    {
        this.projectLength = projectLength;
    }
}
