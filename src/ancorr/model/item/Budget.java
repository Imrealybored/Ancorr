package ancorr.model.item;

import java.sql.Date;

public class Budget
{
    private int budgetId;
    private String budgetName;
    private String budgetDesc;
    private Date budgetDate;
    private int projectId;

    public int getBudgetId()
    {
        return budgetId;
    }

    public void setBudgetId(int budgetId)
    {
        this.budgetId = budgetId;
    }

    public String getBudgetName()
    {
        return budgetName;
    }

    public void setBudgetName(String budgetName)
    {
        this.budgetName = budgetName;
    }

    public String getBudgetDesc()
    {
        return budgetDesc;
    }

    public void setBudgetDesc(String budgetDesc)
    {
        this.budgetDesc = budgetDesc;
    }

    public Date getBudgetDate()
    {
        return budgetDate;
    }

    public void setBudgetDate(Date budgetDate)
    {
        this.budgetDate = budgetDate;
    }

    public int getProjectId()
    {
        return projectId;
    }

    public void setProjectId(int projectId)
    {
        this.projectId = projectId;
    }
}
