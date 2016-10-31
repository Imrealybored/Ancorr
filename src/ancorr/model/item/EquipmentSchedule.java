package ancorr.model.item;

import java.sql.Date;
import java.sql.Time;


public class EquipmentSchedule
{
    private int equipmentScheduleId;
    private int equipmentId;
    private Date arrivalDate;
    private Time timeOfArrival;
    private Date departureDate;
    private Time timeOfDeparture;

    public int getEquipmentScheduleId()
    {
        return equipmentScheduleId;
    }

    public void setEquipmentScheduleId(int equipmentScheduleId)
    {
        this.equipmentScheduleId = equipmentScheduleId;
    }

    public int getEquipmentId()
    {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId)
    {
        this.equipmentId = equipmentId;
    }

    public Date getArrivalDate()
    {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate)
    {
        this.arrivalDate = arrivalDate;
    }

    public Time getTimeOfArrival()
    {
        return timeOfArrival;
    }

    public void setTimeOfArrival(Time timeOfArrival)
    {
        this.timeOfArrival = timeOfArrival;
    }

    public Date getDepartureDate()
    {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate)
    {
        this.departureDate = departureDate;
    }

    public Time getTimeOfDeparture()
    {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Time timeOfDeparture)
    {
        this.timeOfDeparture = timeOfDeparture;
    }
}
