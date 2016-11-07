package ancorr.model.employee;

/**
 * salary is monthly.
 */
public class Position
{
    public Integer id;

    public String title;
    public String description;
    public Double salary;
	
	@Override
	public String toString()
	{
		return title;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof Position && ((Position)obj).id == this.id;
	}
}
