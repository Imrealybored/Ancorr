package ancorr.model.inventory;

public class WarehouseType
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
		return obj instanceof WarehouseType && ((WarehouseType)obj).id == this.id;
	}
}
