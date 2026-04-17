public class SeniorityBonus extends BonusDecorator{
    public SeniorityBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double base = super.calculateBonus(employee);
        return base + (employee.getYearsInCompany()*20);
    }
}
