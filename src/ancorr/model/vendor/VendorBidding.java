package ancorr.model.vendor;

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
}
