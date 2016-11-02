package ancorr.model.project;

import java.sql.Date;

/**
 * subject can be load equipments to job site, build this, build that and such.
 */
public class ProjectSchedule
{
    public int id;
    public int projectId;

    public String subject;
    public Date startDate;
    public Date endDate;
}
