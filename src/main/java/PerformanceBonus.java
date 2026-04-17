public class PerformanceBonus extends BonusDecorator {

    PerformanceBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double currentBonus = super.calculateBonus(employee);

        int score = employee.getPerformancePoints();

        return currentBonus + score * 5.0;
    }
}
