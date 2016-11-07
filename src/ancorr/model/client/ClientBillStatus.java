package ancorr.model.client;

/**
 * created, invoiced, paid.
 */
public class ClientBillStatus
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
		return obj instanceof ClientBillStatus && ((ClientBillStatus)obj).id == this.id;
	}
}
