public class AbsencePenalty extends BonusDecorator {
    public AbsencePenalty(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double base = super.calculateBonus(employee);
        return base - (employee.getAbsenceDays()*5);
    }
}
