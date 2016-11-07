package ancorr.model.contact;


public class ZipCode
{
    public Integer id;

    public Integer zipCode;
	
	@Override
	public String toString()
	{
		return zipCode + "";
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof ZipCode && ((ZipCode)obj).id == this.id;
	}
}
