package ancorr.model.project;


public class ProjectBudget
{
    private int projectBudgetId;
    private int budgetId;
    private int projectId;

    public int getProjectBudgetId()
    {
        return projectBudgetId;
    }

    public void setProjectBudgetId(int projectBudgetId)
    {
        this.projectBudgetId = projectBudgetId;
    }

    public int getBudgetId()
    {
        return budgetId;
    }

    public void setBudgetId(int budgetId)
    {
        this.budgetId = budgetId;
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
