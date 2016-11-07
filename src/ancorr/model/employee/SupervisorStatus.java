package ancorr.model.employee;

public class SupervisorStatus
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
		return obj instanceof SupervisorStatus && ((SupervisorStatus)obj).id == this.id;
	}
}
