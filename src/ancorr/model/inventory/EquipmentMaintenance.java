package ancorr.model.inventory;


public class EquipmentMaintenance
{
    public Integer id;
    public Integer equipmentId;
    public Integer equipmentScheduleId;
    public Integer transactionId;

    public String description;
	
	@Override
	public String toString()
	{
		return description;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EquipmentMaintenance && ((EquipmentMaintenance)obj).id == this.id;
	}
}
