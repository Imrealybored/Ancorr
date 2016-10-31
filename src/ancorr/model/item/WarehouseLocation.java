package ancorr.model.item;


public class WarehouseLocation
{
    private int warehouseLocationId;
    private int warehouseId;
    private String warehouseAddress;
    private int cityId;
    private int stateOrProvinceId;
    private int zipCodeId;
    private int countryId;

    public int getWarehouseLocationId()
    {
        return warehouseLocationId;
    }

    public void setWarehouseLocationId(int warehouseLocationId)
    {
        this.warehouseLocationId = warehouseLocationId;
    }

    public int getWarehouseId()
    {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId)
    {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseAddress()
    {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress)
    {
        this.warehouseAddress = warehouseAddress;
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
