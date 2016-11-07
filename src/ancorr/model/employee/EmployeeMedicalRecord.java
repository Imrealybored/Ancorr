package ancorr.model.employee;


public class EmployeeMedicalRecord
{
    public Integer id;
    public Integer employeeId;

    public String conditions;
    public String physician;
    public String insuranceProvider;
	
	@Override
	public String toString()
	{
		return conditions;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof EmployeeMedicalRecord && ((EmployeeMedicalRecord)obj).id == this.id;
	}
}
