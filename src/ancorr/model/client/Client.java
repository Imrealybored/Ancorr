package ancorr.model.client;

public class Client
{
    public Integer id;
    public Integer clientStatusId; 
    public Integer clientBillingId;
    public Integer addressId;
	
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName + " " + email + " " + phone;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Client && ((Client)obj).id == this.id;
	}
}
