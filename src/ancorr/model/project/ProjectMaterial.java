package ancorr.model.project;

public class ProjectMaterial
{
    private int projectMaterialId;
    private int projectId;
    private int materialId;

    public int getProjectMaterialId()
    {
        return projectMaterialId;
    }

    public void setProjectMaterialId(int projectMaterialId)
    {
        this.projectMaterialId = projectMaterialId;
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }

    public int getMaterialId()
    {
        return materialId;
    }

    public void setMaterialId(int materialId)
    {
        this.materialId = materialId;
    }
}
