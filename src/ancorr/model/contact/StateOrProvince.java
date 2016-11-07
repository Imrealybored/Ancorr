package ancorr.model.contact;


public class StateOrProvince
{
    public Integer id;

    public String stateOrProvinceName;
	
	@Override
	public String toString()
	{
		return stateOrProvinceName;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof StateOrProvince && ((StateOrProvince)obj).id == this.id;
	}
}
