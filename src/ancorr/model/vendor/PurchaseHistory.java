package ancorr.model.vendor;

/**
 * transaction needs to be a FK and PK at the same time.
 */
public class PurchaseHistory
{
    public Integer id;
    public Integer vendorId;
    public Integer materialTypeId;
    public Integer materialStockId;
    public Integer transactionId;
}
