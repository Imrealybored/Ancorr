package ancorr.model.employee;

public class EmployeeBenefitType
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
		return obj instanceof EmployeeBenefitType && ((EmployeeBenefitType)obj).id == this.id;
	}
}
