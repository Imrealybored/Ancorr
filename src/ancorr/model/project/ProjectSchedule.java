package ancorr.model.project;

import java.sql.Date;

/**
 * subject can be load equipments to job site, build this, build that and such.
 */
public class ProjectSchedule
{
    public Integer id;
    public Integer projectId;

    public String subject;
    public Date startDate;
    public Date endDate;
	
	@Override
	public String toString()
	{
		return subject;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof ProjectSchedule && ((ProjectSchedule)obj).id == this.id;
	}
}
