abstract public class BonusDecorator implements Bonus{
    protected Bonus bonus;

    BonusDecorator(Bonus bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateBonus(Employee employee) {

    }
}
