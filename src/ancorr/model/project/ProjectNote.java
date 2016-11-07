package ancorr.model.project;

import java.sql.Date;
import java.sql.Time;

public class ProjectNote
{
    public Integer id;
    public Integer projectId;

    public Date date;
    public Time time;
    public String note;
	
	@Override
	public String toString()
	{
		return note;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof ProjectNote && ((ProjectNote)obj).id == this.id;
	}
}
