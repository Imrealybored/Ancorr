package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * used to mark an equipment in use.
 */
public class EquipmentSchedule
{
    public Integer id;
    public Integer equipmentId;

    public Date leaveDate;
    public Time leaveTime;
    public Date returnDate;
    public Time returnTime;
	public String description;
	
	@Override
	public String toString()
	{
		return description;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EquipmentSchedule && ((EquipmentSchedule)obj).id == this.id;
	}
}
