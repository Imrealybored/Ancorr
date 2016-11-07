package ancorr.model.inventory;


public class Warehouse
{
    private Integer id;
    private Integer addressId;
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
