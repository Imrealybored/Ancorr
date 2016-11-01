package ancorr.model.employee;


public class EmployeeContact
{
    private int ContactId;
    private int EmployeeId;
    private int addressId;
    private String Phone;
    private String email;

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

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
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


}
