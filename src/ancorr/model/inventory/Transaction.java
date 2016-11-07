package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * Amount could be a negative number to represent money spent.
 */
public class Transaction
{
    public Integer id;
    public Integer transactionTypeId;

    public Date date;
    public Time time;
    public Double amount;
	
	@Override
	public String toString()
	{
		return "$" + amount;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Transaction && ((Transaction)obj).id == this.id;
	}
}
