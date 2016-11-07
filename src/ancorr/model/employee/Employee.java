package ancorr.model.employee;


public class Employee
{
    public Integer id;
    public Integer positionId;
    public Integer scheduleId;
    public Integer employeeStatusId;

    public String firstName;
    public String lastName;
	
	@Override
	public String toString()
	{
		return firstName + " " + lastName;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Employee && ((Employee)obj).id == this.id;
	}
}
