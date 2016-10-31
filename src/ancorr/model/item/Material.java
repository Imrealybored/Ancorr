package ancorr.model.item;


public class Material
{
    private int materialId;
    private String materialName;
    private double materialCost;
    private int materialQuantity;
    private String materialStatus;

    public int getMaterialId()
    {
        return materialId;
    }

    public void setMaterialId(int materialId)
    {
        this.materialId = materialId;
    }

    public String getMaterialName()
    {
        return materialName;
    }

    public void setMaterialName(String materialName)
    {
        this.materialName = materialName;
    }

    public double getMaterialCost()
    {
        return materialCost;
    }

    public void setMaterialCost(double materialCost)
    {
        this.materialCost = materialCost;
    }

    public int getMaterialQuantity()
    {
        return materialQuantity;
    }

    public void setMaterialQuantity(int materialQuantity)
    {
        this.materialQuantity = materialQuantity;
    }

    public String getMaterialStatus()
    {
        return materialStatus;
    }

    public void setMaterialStatus(String materialStatus)
    {
        this.materialStatus = materialStatus;
    }
}
