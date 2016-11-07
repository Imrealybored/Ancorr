package ancorr.model.employee;
import ancorr.controller.MainApplication;

public class EmployeeBenefit
{
    public Integer id;
    public Integer employeeId;
    public Integer employeeBenefitTypeId;
	
	@Override
	public String toString()
	{
		EmployeeBenefitType type = MainApplication.getDatabaseAccess().getEmployeeBenefitType(employeeBenefitTypeId);
		return type.toString();
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EmployeeBenefit && ((EmployeeBenefit)obj).id == this.id;
	}
}
