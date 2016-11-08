package ancorr.model.inventory;


public class Warehouse
{
	public Integer id;
	public Integer addressId;
    public Integer warehouseTypeId;

    private String name;
	
	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Warehouse && ((Warehouse)obj).id == this.id;
	}
}
