package ancorr.model.inventory;

import java.sql.Date;
import java.sql.Time;

/**
 * Amount could be a negative number to represent money spent.
 */
public class Transaction
{
    public Integer transactionId;
    public Integer transactionTypeId;

    public Date date;
    public Time time;
    public Double amount;
}
