package ancorr.model.client;

/**
 * transaction id can be null, only filled when the client pays the bill.
 */
public class ClientBill
{
    public int id;
    public int clientId;
    public int transactionId;
    public int billStatusId;

    public String clientPaymentInfo;
}
