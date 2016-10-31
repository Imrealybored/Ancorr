package ancorr.model.item;


public class EquipmentMaintenance
{
    private int equipMainId;
    private String description;
    private double cost;
    private int equipmentId;

    public int getEquipMainId()
    {
        return equipMainId;
    }

    public void setEquipMainId(int equipMainId)
    {
        this.equipMainId = equipMainId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getEquipmentId()
    {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId)
    {
        this.equipmentId = equipmentId;
    }
}
