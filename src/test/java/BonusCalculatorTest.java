import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusCalculatorTest {
    @Test
    void appliesBonuses() {
        Employee julian = new Employee("Julian",4,10,2,18,true);
        BonusService bs = new BonusService(500, 2000);
        BonusCalculator bc = new BonusCalculator(bs);
        assertEquals(792.0, bc.calculate(julian));
    }
}
