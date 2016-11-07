package ancorr.model.inventory;

/**
 * project budget, material cost, project payment, maintenance fee, etc.
 */
public class TransactionType
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
		return obj instanceof TransactionType && ((TransactionType)obj).id == this.id;
	}
}
