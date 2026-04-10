abstract public class BonusDecorator implements Bonus{
    protected Bonus bonus;

    public BonusDecorator(Bonus bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateBonus(Employee employee) {
        return this.bonus.calculateBonus(employee);
    }
}
