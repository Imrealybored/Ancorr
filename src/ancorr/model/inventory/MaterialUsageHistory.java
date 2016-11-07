package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * created when a project uses material from the warehouse.
 */
public class MaterialUsageHistory
{
    public Integer id;
    public Integer materialTypeId;
    public Integer projectId;

    public Date date;
    public Time time;
    public Double quantity;
    public String description;
	
	@Override
	public String toString()
	{
		return description;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof MaterialUsageHistory && ((MaterialUsageHistory)obj).id == this.id;
	}
}
