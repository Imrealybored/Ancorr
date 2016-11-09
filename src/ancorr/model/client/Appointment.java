package ancorr.model.client;

import java.sql.Date;
import java.sql.Time;

public class Appointment
{
    //TODO: all the equals and to string methods.

    public Integer id;

    public Date date;
    public Time time;
    public String subject;
	
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
