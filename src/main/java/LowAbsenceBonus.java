public class LowAbsenceBonus extends BonusDecorator{
    public LowAbsenceBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double base = super.calculateBonus(employee);
        double averageAbsent = employee.getYearsInCompany() * 15;
        double lowerAverageAbsent = employee.getYearsInCompany() * 5;
        if (averageAbsent > employee.getAbsenceDays()){
            base += 50;
        }
        if (lowerAverageAbsent > employee.getAbsenceDays()) {
            base += 50;
        }

        return base;
    }
}
