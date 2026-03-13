public class BonusService {
    private double minAmount;
    private double maxAmount;

    public BonusService(double minAmount, double maxAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public double applyRestrictions(double amount) {
        if (amount < minAmount) {
            return minAmount;
        }
        if (amount > maxAmount) {
            return maxAmount;
        }
        return amount;
    }
}
