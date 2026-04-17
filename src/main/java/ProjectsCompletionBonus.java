public class ProjectsCompletionBonus extends BonusDecorator {

    public ProjectsCompletionBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double base = super.calculateBonus(employee);
        return base + employee.getCompletedProjects() * 100.0;
    }
}
