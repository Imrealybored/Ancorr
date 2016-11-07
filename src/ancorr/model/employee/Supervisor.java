package ancorr.model.employee;
import ancorr.controller.MainApplication;

/**
 * employeeId should be a foreign key and primary key at the same time.
 */
public class Supervisor
{
    public Integer id;
    public Integer employeeId;
    public Integer supervisorStatusId;
	
	@Override
	public String toString()
	{
		Employee employee = MainApplication.getDatabaseAccess().getEmployee(employeeId);
		return employee.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Supervisor && ((Supervisor)obj).id == this.id;
	}
}
