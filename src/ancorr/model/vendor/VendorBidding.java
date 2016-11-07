package ancorr.model.vendor;
import ancorr.controller.MainApplication;
import ancorr.model.inventory.MaterialType;

/**
 * A vender's bidding on a certain material. a vendor can list a bid on multiple materials.
 */
public class VendorBidding
{
    public Integer id;
    public Integer vendorId;
    public Integer materialTypeId;

    public Double quantity;
    public Double unitCost;
	
	@Override
	public String toString()
	{
		MaterialType type = MainApplication.getDatabaseAccess().getMaterialType(materialTypeId);
		return quantity + " " + type.toString() + " for $" + unitCost + " each";
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof VendorBidding && ((VendorBidding)obj).id == this.id;
	}
}
