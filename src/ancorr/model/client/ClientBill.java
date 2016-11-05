package ancorr.model.client;

/**
 * transaction id can be null, only filled when the client pays the bill.
 */
public class ClientBill
{
    public Integer id;
    public Integer clientId;
    public Integer transactionId;
    public Integer billStatusId;

    public String clientPaymentInfo;
}
