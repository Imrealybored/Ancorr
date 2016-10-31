package ancorr.model.client;

public class ClientStatus
{
    private int clientStatCode;
    private int clientId;
    private String clientStatDesc;

    public int getClientStatCode()
    {
        return clientStatCode;
    }

    public void setClientStatCode(int clientStatCode)
    {
        this.clientStatCode = clientStatCode;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public String getClientStatDesc()
    {
        return clientStatDesc;
    }

    public void setClientStatDesc(String clientStatDesc)
    {
        this.clientStatDesc = clientStatDesc;
    }
}
