package ancorr.model.client;

public class ClientStatus
{
    public Integer id;

    public String description;
	
	@Override
	public String toString()
	{
		return description;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof ClientStatus && ((ClientStatus)obj).id == this.id;
	}
}
