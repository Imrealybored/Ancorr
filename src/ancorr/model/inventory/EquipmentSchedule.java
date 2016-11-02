package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * used to mark an equipment in use.
 */
public class EquipmentSchedule
{
    public int id;
    public int equipmentId;

    public Date leaveDate;
    public Time leaveTime;
    public Date returnDate;
    public Time returnTime;
	public String reason;
}
