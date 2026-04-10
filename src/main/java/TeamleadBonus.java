public class TeamleadBonus extends BonusDecorator {
    public TeamleadBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double base = super.calculateBonus(employee);
        if (employee.getIsTeamLeader()) {
            base += 150.0;
        }
        return base;
    }
}
