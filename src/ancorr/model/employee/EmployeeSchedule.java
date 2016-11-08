package ancorr.model.employee;

import ancorr.controller.MainApplication;

import java.sql.Time;

/**
 * related to multiple shifts.
 */
public class EmployeeSchedule
{
    public Integer id;
    public Integer employeeId;

    public Time regularHours;
    public Time overTimeHours;
	
	@Override
	public String toString()
	{
		Employee employee = MainApplication.getDatabaseAccess().getEmployee(employeeId);
		return employee.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EmployeeSchedule && ((EmployeeSchedule)obj).id == this.id;
	}
}
