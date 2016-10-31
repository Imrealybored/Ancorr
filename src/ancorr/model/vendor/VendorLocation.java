package ancorr.model.vendor;

public class VendorLocation
{
    private int VendorLocationID;
    private String VendorAddress;
    private int cityId;
    private int zipCodeId;
    private int stateOrProvinceId;
    private int vendorID;
    private int countryId;

    public int getVendorLocationID()
    {
        return VendorLocationID;
    }

    public void setVendorLocationID(int vendorLocationID)
    {
        VendorLocationID = vendorLocationID;
    }

    public String getVendorAddress()
    {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress)
    {
        VendorAddress = vendorAddress;
    }

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }

    public int getZipCodeId()
    {
        return zipCodeId;
    }

    public void setZipCodeId(int zipCodeId)
    {
        this.zipCodeId = zipCodeId;
    }

    public int getStateOrProvinceId()
    {
        return stateOrProvinceId;
    }

    public void setStateOrProvinceId(int stateOrProvinceId)
    {
        this.stateOrProvinceId = stateOrProvinceId;
    }

    public int getVendorID()
    {
        return vendorID;
    }

    public void setVendorID(int vendorID)
    {
        this.vendorID = vendorID;
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
