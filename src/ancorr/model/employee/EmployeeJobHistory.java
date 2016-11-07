package ancorr.model.employee;


public class EmployeeJobHistory
{
    public Integer id;
    public Integer employeeID;

    public String duties;
    public String evaluation;
	
	@Override
	public String toString()
	{
		return duties;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EmployeeJobHistory && ((EmployeeJobHistory)obj).id == this.id;
	}
}
