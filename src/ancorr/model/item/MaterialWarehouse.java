package ancorr.model.item;


public class MaterialWarehouse
{
    private int materialWarehouse;
    private int materialID;
    private int warehouseID;

    public int getMaterialWarehouse()
    {
        return materialWarehouse;
    }

    public void setMaterialWarehouse(int materialWarehouse)
    {
        this.materialWarehouse = materialWarehouse;
    }

    public int getMaterialID()
    {
        return materialID;
    }

    public void setMaterialID(int materialID)
    {
        this.materialID = materialID;
    }

    public int getWarehouseID()
    {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID)
    {
        this.warehouseID = warehouseID;
    }
}
