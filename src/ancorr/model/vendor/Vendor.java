package ancorr.model.vendor;

public class Vendor
{
    public Integer id;
    public Integer contactId;

    public String name;
	
	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Vendor && ((Vendor)obj).id == this.id;
	}
}
