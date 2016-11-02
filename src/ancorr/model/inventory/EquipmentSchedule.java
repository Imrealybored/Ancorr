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

    public Date arrivalDate;
    public Time timeOfArrival;
    public Date departureDate;
    public Time timeOfDeparture;
}
