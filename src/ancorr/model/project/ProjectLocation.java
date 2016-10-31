package ancorr.model.project;

public class ProjectLocation
{
    private int projectLocationId;
    private int projectId;
    private String projectAddress;
    private int projectCityId;
    private int postalCodeId;

    public int getProjectLocationId()
    {
        return projectLocationId;
    }

    public void setProjectLocationId(int projectLocationId)
    {
        this.projectLocationId = projectLocationId;
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectAddress()
    {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress)
    {
        this.projectAddress = projectAddress;
    }

    public int getProjectCityId()
    {
        return projectCityId;
    }

    public void setProjectCityId(int projectCityId)
    {
        this.projectCityId = projectCityId;
    }

    public int getPostalCodeId()
    {
        return postalCodeId;
    }

    public void setPostalCodeId(int postalCodeId)
    {
        this.postalCodeId = postalCodeId;
    }
}
