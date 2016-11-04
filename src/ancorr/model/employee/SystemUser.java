package ancorr.model.employee;

/**
 * employeeId should be a foreign key and primary key at the same time. <br>
 * username should has be a primary key as well, as it should be unique.
 */
public class SystemUser
{
    public int id;
    public int employeeId;
    public int systemUserStatusId;

    public String username;
    public String password;
}
