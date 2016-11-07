package ancorr.model.contact;
import ancorr.controller.MainApplication;

public class Contact
{
    public Integer id;
    public Integer addressId;

    public String email;
    public String phone;
	
	@Override
	public String toString()
	{
		Address address = MainApplication.getDatabaseAccess().getAddress(addressId);
		return address.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Contact && ((Contact)obj).id == this.id;
	}
}
