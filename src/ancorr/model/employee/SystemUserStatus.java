package ancorr.model.employee;

public class SystemUserStatus
{
    public Integer id;

    public String description;
	
	@Override
	public String toString()
	{
		return description;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof SystemUserStatus && ((SystemUserStatus)obj).id == this.id;
	}
}
