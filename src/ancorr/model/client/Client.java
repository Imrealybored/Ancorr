package ancorr.model.client;

public class Client
{
    public Integer id;
    public Integer contactId;
    public Integer clientStatusId;

    public String firstName;
    public String lastName;
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Client && ((Client)obj).id == this.id;
	}
}
