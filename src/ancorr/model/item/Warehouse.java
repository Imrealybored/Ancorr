package ancorr.model.item;


public class Warehouse
{
    private int warehouseId;
    private int addressId;
    private String warehouseName;
    private String warehouseType;

    public int getWarehouseId()
    {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId)
    {
        this.warehouseId = warehouseId;
    }

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public String getWarehouseName()
    {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName)
    {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseType()
    {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType)
    {
        this.warehouseType = warehouseType;
    }
}
