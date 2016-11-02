package ancorr.model.vendor;

/**
 * A vender's bidding on a certain material. a vendor can list a bid on multiple materials.
 */
public class VendorBidding
{
    public int id;
    public int vendorId;
    public int materialTypeId;

    public double quantity;
    public double unitCost;
}
