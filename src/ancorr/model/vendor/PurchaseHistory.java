package ancorr.model.vendor;
import ancorr.controller.MainApplication;
import ancorr.model.inventory.MaterialStock;
import ancorr.model.inventory.Transaction;

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
	
	@Override
	public String toString()
	{
		MaterialStock materialStock = MainApplication.getDatabaseAccess().getMaterialStock(materialStockId);
		Transaction transaction = MainApplication.getDatabaseAccess().getTransaction(transactionId);
		return materialStock.toString() + " for $" + Math.abs(transaction.amount);
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof PurchaseHistory && ((PurchaseHistory)obj).id == this.id;
	}
}
