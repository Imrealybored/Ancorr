package ancorr.model.employee;

import java.sql.Date;
import java.sql.Time;


public class EmployeeShift
{
    private int shiftId;
    private int scheduleId;
    private Date shiftDate;
    private String shiftDay;
    private String shiftMonth;
    private Time startTime;
    private Time endTime;

    public int getShiftId()
    {
        return shiftId;
    }

    public void setShiftId(int shiftId)
    {
        this.shiftId = shiftId;
    }

    public int getScheduleId()
    {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId)
    {
        this.scheduleId = scheduleId;
    }

    public Date getShiftDate()
    {
        return shiftDate;
    }

    public void setShiftDate(Date shiftDate)
    {
        this.shiftDate = shiftDate;
    }

    public String getShiftDay()
    {
        return shiftDay;
    }

    public void setShiftDay(String shiftDay)
    {
        this.shiftDay = shiftDay;
    }

    public String getShiftMonth()
    {
        return shiftMonth;
    }

    public void setShiftMonth(String shiftMonth)
    {
        this.shiftMonth = shiftMonth;
    }

    public Time getStartTime()
    {
        return startTime;
    }

    public void setStartTime(Time startTime)
    {
        this.startTime = startTime;
    }

    public Time getEndTime()
    {
        return endTime;
    }

    public void setEndTime(Time endTime)
    {
        this.endTime = endTime;
    }
}
