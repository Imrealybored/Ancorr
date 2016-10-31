package ancorr.model.client;


public class ClientBilling
{
    private int clientBillingId;
    private int clientId;
    private String clientBillStatus;
    private String clientPaymentInfo;

    public int getClientBillingId()
    {
        return clientBillingId;
    }

    public void setClientBillingId(int clientBillingId)
    {
        this.clientBillingId = clientBillingId;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public String getClientBillStatus()
    {
        return clientBillStatus;
    }

    public void setClientBillStatus(String clientBillStatus)
    {
        this.clientBillStatus = clientBillStatus;
    }

    public String getClientPaymentInfo()
    {
        return clientPaymentInfo;
    }

    public void setClientPaymentInfo(String clientPaymentInfo)
    {
        this.clientPaymentInfo = clientPaymentInfo;
    }
}
