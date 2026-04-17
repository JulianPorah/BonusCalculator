public class SeniorityBonus extends BonusDecorator{
    int bonus =0;

    public SeniorityBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double base = super.calculateBonus(employee);
        return base+ (employee.getYearsInCompany()*20);
    }
}
