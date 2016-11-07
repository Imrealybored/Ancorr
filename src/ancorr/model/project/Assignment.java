package ancorr.model.project;

public class Assignment
{
    public Integer id;
    public Integer employeeId;
    public Integer projectId;

    public String duty;
	
	@Override
	public String toString()
	{
		return duty;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Assignment && ((Assignment)obj).id == this.id;
	}
}
