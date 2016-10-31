package ancorr.model.employee;


public class EmployeeContact
{
    private int ContactId;
    private int EmployeeId;
    private String Phone;
    private String email;
    private String address;
    private int cityId;
    private int countryId;
    private int stateOrProvinceId;
    private int postalCodeId;

    public int getContactId()
    {
        return ContactId;
    }

    public void setContactId(int contactId)
    {
        ContactId = contactId;
    }

    public int getEmployeeId()
    {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        EmployeeId = employeeId;
    }

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String phone)
    {
        Phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
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

    public EmployeeContact(int contactId, int employeeId, String phone, String email, String address, int cityId, int countryId, int stateOrProvinceId, int postalCodeId)
    {
        ContactId = contactId;
        EmployeeId = employeeId;
        Phone = phone;
        this.email = email;
        this.address = address;
        this.cityId = cityId;
        this.countryId = countryId;
        this.stateOrProvinceId = stateOrProvinceId;
        this.postalCodeId = postalCodeId;
    }
}
