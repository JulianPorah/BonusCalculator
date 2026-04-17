public class BonusCalculator {

    private BonusService bonusService;

    public BonusCalculator(BonusService bonusService) {
        this.bonusService = bonusService;
    }

    public double calculate(Employee employee) {

        Bonus bonus = new BaseBonus();

        bonus = new SeniorityBonus(bonus);
        bonus = new PerformanceBonus(bonus);
        bonus = new ProjectsCompletionBonus(bonus);
        bonus = new TeamleadBonus(bonus);
        bonus = new LowAbsenceBonus(bonus);

        bonus = new AbsencePenalty(bonus);

        // Multiplier am ende
        bonus = new PerformanceMultiplier(bonus);

        double result = bonus.calculateBonus(employee);

        result = bonusService.applyRestrictions(result);

        return result;
    }
}