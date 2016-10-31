package ancorr.model.client;

public class ClientLocation
{
    private int clientLocationId;
    private int clientId;
    private String address;
    private int cityId;
    private int countryId;
    private int stateOrProvinceId;
    private int postalCodeId;

    public int getClientLocationId()
    {
        return clientLocationId;
    }

    public void setClientLocationId(int clientLocationId)
    {
        this.clientLocationId = clientLocationId;
    }

    public int getClientId()
    {
        return clientId;
    }

    public void setClientId(int clientId)
    {
        this.clientId = clientId;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }

    public int getCountryId()
    {
        return countryId;
    }

    public void setCountryId(int countryId)
    {
        this.countryId = countryId;
    }

    public int getStateOrProvinceId()
    {
        return stateOrProvinceId;
    }

    public void setStateOrProvinceId(int stateOrProvinceId)
    {
        this.stateOrProvinceId = stateOrProvinceId;
    }

    public int getPostalCodeId()
    {
        return postalCodeId;
    }

    public void setPostalCodeId(int postalCodeId)
    {
        this.postalCodeId = postalCodeId;
    }
}
