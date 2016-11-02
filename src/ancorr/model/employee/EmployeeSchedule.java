package ancorr.model.employee;

import java.sql.Time;

/**
 * related to multiple shifts.
 */
public class EmployeeSchedule
{
    public int id;
    public int employeeId;

    public Time regularHours;
    public Time overTimeHours;
}
