package ancorr.model.client;

import java.sql.Date;
import java.sql.Time;

public class Appointment
{
    private int appointmentId;
    private Date appointmentDate;
    private Time appointmentTime;
    private String appSubject;

    public int getAppointmentId()
    {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId)
    {
        this.appointmentId = appointmentId;
    }

    public Date getAppointmentDate()
    {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate)
    {
        this.appointmentDate = appointmentDate;
    }

    public Time getAppointmentTime()
    {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime)
    {
        this.appointmentTime = appointmentTime;
    }

    public String getAppSubject()
    {
        return appSubject;
    }

    public void setAppSubject(String appSubject)
    {
        this.appSubject = appSubject;
    }
}
