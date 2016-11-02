package ancorr.model.vendor;

/**
 * transaction needs to be a FK and PK at the same time.
 */
public class PurchaseHistory
{
    public int id;
    public int vendorId;
    public int materialTypeId;
    public int materialStockId;
    public int transactionId;
}
