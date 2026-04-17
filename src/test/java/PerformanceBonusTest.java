import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceBonusTest {
    private PerformanceBonus pb;
    private BaseBonus base;

    @BeforeEach
    void setUp() {
        this.base = new BaseBonus();
        this.pb = new PerformanceBonus(this.base);
    }

    @Test
    void shouldApplyBonusWithTenPoints() {
        Employee julian = new Employee("Julian",4,10,2,18,true);
        double baseBonus = this.base.calculateBonus(julian);
        double withPerformanceBonus = this.pb.calculateBonus(julian);
        double diff = withPerformanceBonus - baseBonus;
        assertEquals(50.0, diff);
    }

    @Test
    void shouldApplyBonusTwentyPoints() {
        Employee julian = new Employee("Julian",4,20,2,18,true);
        double baseBonus = this.base.calculateBonus(julian);
        double withPerformanceBonus = this.pb.calculateBonus(julian);
        double diff = withPerformanceBonus - baseBonus;
        assertEquals(100.0, diff);
    }

    @Test
    void shouldNotApplyBonus() {
        Employee julian = new Employee("Julian",4,0,2,18,false);
        double baseBonus = this.base.calculateBonus(julian);
        double withPerformanceBonus = this.pb.calculateBonus(julian);
        double diff = withPerformanceBonus - baseBonus;
        assertEquals(0, diff);
    }
}