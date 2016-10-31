package ancorr.model.project;


public class ProjectEquipment
{
    private int projectEquipmentId;
    private int equipmentId;
    private int projectId;

    public int getProjectEquipmentId()
    {
        return projectEquipmentId;
    }

    public void setProjectEquipmentId(int projectEquipmentId)
    {
        this.projectEquipmentId = projectEquipmentId;
    }

    public int getEquipmentId()
    {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId)
    {
        this.equipmentId = equipmentId;
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }
}
