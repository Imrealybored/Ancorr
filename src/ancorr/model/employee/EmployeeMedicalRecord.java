package ancorr.model.employee;


public class EmployeeMedicalRecord
{
    private int employeeMedicalRecordId;
    private String conditions;
    private String physician;
    private String insuranceProvider;
    private int employeeId;

    public int getEmployeeMedicalRecordId()
    {
        return employeeMedicalRecordId;
    }

    public void setEmployeeMedicalRecordId(int employeeMedicalRecordId)
    {
        this.employeeMedicalRecordId = employeeMedicalRecordId;
    }

    public String getConditions()
    {
        return conditions;
    }

    public void setConditions(String conditions)
    {
        this.conditions = conditions;
    }

    public String getPhysician()
    {
        return physician;
    }

    public void setPhysician(String physician)
    {
        this.physician = physician;
    }

    public String getInsuranceProvider()
    {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider)
    {
        this.insuranceProvider = insuranceProvider;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }
}
