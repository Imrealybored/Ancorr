package ancorr.model.inventory;
import ancorr.controller.MainApplication;

/**
 * material that the company have in stock
 */
public class MaterialStock
{
    public Integer id;
    public Integer warehouseID;
    public Integer materialTypeId;

    public Double originalQuantity;
    public Double quantity;
	
	@Override
	public String toString()
	{
		MaterialType type = MainApplication.getDatabaseAccess().getMaterialType(materialTypeId);
		return type.toString() + ": " + quantity;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof MaterialStock && ((MaterialStock)obj).id == this.id;
	}
}
