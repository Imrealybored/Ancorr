package ancorr.model.inventory;
import ancorr.controller.MainApplication;

public class Equipment
{
    public Integer id;
    public Integer equipmentTypeId;

    public Integer quantity;
	
	@Override
	public String toString()
	{
		EquipmentType type = MainApplication.getDatabaseAccess().getEquipmentType(equipmentTypeId);;
		return type.toString() + ": " + quantity;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Equipment && ((Equipment)obj).id == this.id;
	}
}
