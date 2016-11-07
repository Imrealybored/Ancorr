package ancorr.model.contact;


public class City
{
    public Integer id;

    public String cityName;
	
	@Override
	public String toString()
	{
		return cityName;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof City && ((City)obj).id == this.id;
	}
}
