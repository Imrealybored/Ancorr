package ancorr.model.employee;

import java.sql.Time;

/**
 * related to multiple shifts.
 */
public class EmployeeSchedule
{
    public Integer id;
    public Integer employeeId;

    public Time regularHours;
    public Time overTimeHours;
	
	@Override
	public String toString()
	{
		return subject;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Appointment && ((Appointment)obj).id == this.id;
	}
}
