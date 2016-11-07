package ancorr.model.contact;


public class Country
{
    public Integer id;

    public String countryName;
	
	@Override
	public String toString()
	{
		return countryName;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Country && ((Country)obj).id == this.id;
	}
}
