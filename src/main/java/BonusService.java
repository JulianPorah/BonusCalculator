public class BonusService {
    public double applyRestrictions(double amount) {
        if (amount < 500) {
            return 500;
        }
        if (amount > 2000) {
            return 2000;
        }
        return amount;
    }
}
