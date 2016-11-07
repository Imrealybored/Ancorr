package ancorr.model.inventory;

public class EquipmentType
{
    public Integer id;

    public String type;
	
	@Override
	public String toString()
	{
		return type;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EquipmentType && ((EquipmentType)obj).id == this.id;
	}
}
