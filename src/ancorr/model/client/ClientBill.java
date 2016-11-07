package ancorr.model.client;
import ancorr.model.inventory.Transaction;
import ancorr.controller.MainApplication;

/**
 * transaction id can be null, only filled when the client pays the bill.
 */
public class ClientBill
{
    public Integer id;
    public Integer clientId;
    public Integer transactionId;
    public Integer billStatusId;

	public Double amount;
    public String clientPaymentInfo;
	
	@Override
	public String toString()
	{
		return "$" + amount;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof ClientBill && ((ClientBill)obj).id == this.id;
	}
}
