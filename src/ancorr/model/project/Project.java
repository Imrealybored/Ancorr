package ancorr.model.project;

public class Project
{
    public Integer id;
    public Integer clientId;
    public Integer supervisorId;
    public Integer projectStatusId;
	
	public String description;
	
	@Override
	public String toString()
	{
		return description;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Project && ((Project)obj).id == this.id;
	}
}
