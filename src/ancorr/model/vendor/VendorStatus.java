package ancorr.model.vendor;

public class VendorStatus
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
		return obj instanceof VendorStatus && ((VendorStatus)obj).id == this.id;
	}
}
