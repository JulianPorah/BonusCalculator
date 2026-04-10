
public class BaseBonus implements Bonus{
    public BaseBonus() {}

    @Override
    public double calculateBonus(Employee employee) {
        return 500.0;
    }
}