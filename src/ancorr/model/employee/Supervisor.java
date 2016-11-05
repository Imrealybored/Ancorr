package ancorr.model.employee;

/**
 * employeeId should be a foreign key and primary key at the same time.
 */
public class Supervisor
{
    public Integer id;
    public Integer employeeId;
    public Integer supervisorStatusId;
}
