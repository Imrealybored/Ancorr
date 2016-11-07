package ancorr.model.employee;

public class Payroll
{
    public Integer id;
    public Integer employeeId;
    public Integer transactionId;
	
	public double amount;
	
	@Override
	public String toString()
	{
		return "$" + amount;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Payroll && ((Payroll)obj).id == this.id;
	}
}
