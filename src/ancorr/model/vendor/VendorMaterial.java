package ancorr.model.vendor;

public class VendorMaterial
{
    private int vendorMaterialId;
    private int vendorId;
    private int materialId;

    public int getVendorMaterialId()
    {
        return vendorMaterialId;
    }

    public void setVendorMaterialId(int vendorMaterialId)
    {
        this.vendorMaterialId = vendorMaterialId;
    }

    public int getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(int vendorId)
    {
        this.vendorId = vendorId;
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
