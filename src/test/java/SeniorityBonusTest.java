import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeniorityBonusTest {
    private BaseBonus base;
    private SeniorityBonus seniorityBonus;

    @BeforeEach
    void setup() {
        this.base = new BaseBonus();
        this.seniorityBonus = new SeniorityBonus(base);
    }

    @Test
    void shouldApplyBonus() {
        Employee julian = new Employee("Julian",4,10,2,18,true);
        double baseBonus = this.base.calculateBonus(julian);
        double withSeniorityBonus = this.seniorityBonus.calculateBonus(julian);
        double diff = withSeniorityBonus - baseBonus;
        assertEquals(80.0,diff);
    }

    @Test
    void shouldNotApplyBonus() {
        Employee julian = new Employee("Julian",0,10,2,18,false);
        double baseBonus = this.base.calculateBonus(julian);
        double withSeniorityBonus = this.seniorityBonus.calculateBonus(julian);
        double diff = withSeniorityBonus - baseBonus;
        assertEquals(0.0, diff);
    }
}
