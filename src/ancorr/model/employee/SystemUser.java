package ancorr.model.employee;

/**
 * employeeId should be a foreign key and primary key at the same time.
 */
public class SystemUser
{
    public int id;
    public int employeeId;
    public int systemUserStatusId;

    public String username;
    public String password;
}
