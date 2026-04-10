public class PerformanceBonus extends BonusDecorator {

    PerformanceBonus(Bonus bonus) {
        super(bonus);
    }

    @Override
    public double calculateBonus(Employee employee) {
        double currentBonus = super.calculateBonus(employee);

        int score = employee.getPerformancePoints();

        double factor;
        if (score < 50) {
            factor = 0.8;
        } else if (score <= 80) {
            factor = 1.0;
        } else {
            factor = 1.5;
        }

        return currentBonus * factor;
    }
}
