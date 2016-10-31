package ancorr.model.employee;

import java.sql.Time;


public class EmployeeSchedule
{
    private int scheduleId;
    private int employeeId;
    private Time regHoursWorked;
    private Time overTimeHours;

    public int getScheduleId()
    {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId)
    {
        this.scheduleId = scheduleId;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public Time getRegHoursWorked()
    {
        return regHoursWorked;
    }

    public void setRegHoursWorked(Time regHoursWorked)
    {
        this.regHoursWorked = regHoursWorked;
    }

    public Time getOverTimeHours()
    {
        return overTimeHours;
    }

    public void setOverTimeHours(Time overTimeHours)
    {
        this.overTimeHours = overTimeHours;
    }
}
