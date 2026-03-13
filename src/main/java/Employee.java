public class Employee {
    private int yearsInCompany;
    private int performancePoints;
    private int completedProjects;
    private int absenceDays;
    private boolean isTeamLeader;

    public int getYearsInCompany() {
        return this.yearsInCompany;
    }

    public void setYearsInCompany(int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }

    public int getPerformancePoints() {
        return this.performancePoints;
    }

    public void setPerformancePoints(int performancePoints) {
        this.performancePoints = performancePoints;
    }

    public int getCompletedProjects() {
        return this.completedProjects;
    }

    public void setCompletedProjects(int completedProjects) {
        this.completedProjects = completedProjects;
    }

    public int getAbsenceDays() {
        return this.absenceDays;
    }

    public void setAbsenceDays(int absenceDays) {
        this.absenceDays = absenceDays;
    }

    public boolean getIsTeamLeader() {
        return this.isTeamLeader;
    }

    public void setTeamLeader(boolean isTeamLeader) {
        this.isTeamLeader = isTeamLeader;
    }
}
