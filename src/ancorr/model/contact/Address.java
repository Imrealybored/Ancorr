package ancorr.model.contact;

public class Address
{
    public Integer id;
    public Integer cityId;
    public Integer stateOrProvinceId;
    public Integer zipCodeId;
    public Integer countryId;

    public String street;
	
	@Override
	public String toString()
	{
		return street;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Address && ((Address)obj).id == this.id;
	}
}
