package ancorr.model.location;

public class Address
{
    private int addressId;
    private String street;
    private int cityId;
    private int stateOrProvinceId;
    private int zipCodeId;
    private int countryId;

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }

    public int getStateOrProvinceId()
    {
        return stateOrProvinceId;
    }

    public void setStateOrProvinceId(int stateOrProvinceId)
    {
        this.stateOrProvinceId = stateOrProvinceId;
    }

    public int getZipCodeId()
    {
        return zipCodeId;
    }

    public void setZipCodeId(int zipCodeId)
    {
        this.zipCodeId = zipCodeId;
    }

    public int getCountryId()
    {
        return countryId;
    }

    public void setCountryId(int countryId)
    {
        this.countryId = countryId;
    }
}
