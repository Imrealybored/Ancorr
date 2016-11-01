package ancorr.model.client;


public class ClientContact
{
    private int clientContactId;
    private int clientId;
    private int addressId;
    private String emailAddress;
    private String phone;

    public int getClientContactId()
    {
        return clientContactId;
    }

    public void setClientContactId(int clientContactId)
    {
        this.clientContactId = clientContactId;
    }

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}
