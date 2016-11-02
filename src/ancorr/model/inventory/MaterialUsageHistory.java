package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * created when a project uses material from the warehouse.
 */
public class MaterialUsageHistory
{
    public int id;
    public int materialTypeId;
    public int projectId;

    public Date date;
    public Time time;
    public double quantity;
    public String note;
}
