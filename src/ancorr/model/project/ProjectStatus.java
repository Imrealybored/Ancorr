package ancorr.model.project;

/**
 * planned, started, finished.
 */
public class ProjectStatus
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
		return obj instanceof ProjectStatus && ((ProjectSchedule)obj).id == this.id;
	}
}
