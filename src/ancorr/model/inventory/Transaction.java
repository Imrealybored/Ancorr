package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * Amount could be a negative number to represent money spent.
 */
public class Transaction
{
    public int transactionId;
    public int transactionTypeId;

    public Date date;
    public Time time;
    public double amount;
}
