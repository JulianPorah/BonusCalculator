import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceBonusTest {
    private PerformanceBonus performanceBonus;
    private BaseBonus base;

    private Employee prepareEmployeeForPerformance(Integer performancePoints) {
        return new Employee(
                "Test",
                2,
                performancePoints,
                2,
                30,
                false
        );
    }

    @BeforeEach
    void setUp() {
        this.base = new BaseBonus();
        this.performanceBonus = new PerformanceBonus(this.base);
    }

    @Test
    void shouldFactorForLessThan50Points() {
        double performanceBonus = this.performanceBonus.calculateBonus(
                prepareEmployeeForPerformance(49)
        );
        double baseBonus = this.base.calculateBonus(
                prepareEmployeeForPerformance(49)
        );

        assertEquals(baseBonus * 0.8, performanceBonus);
    }
    @Test
    void shouldFactorForLessThanOrEqual80Points() {
        double performanceBonus = this.performanceBonus.calculateBonus(
                prepareEmployeeForPerformance(60)
        );
        double baseBonus = this.base.calculateBonus(
                prepareEmployeeForPerformance(60)
        );
        assertEquals(baseBonus, performanceBonus);
    }
    @Test
    void shouldFactorForOver80Points() {
        double performanceBonus = this.performanceBonus.calculateBonus(
                prepareEmployeeForPerformance(99)
        );
        double baseBonus = this.base.calculateBonus(
                prepareEmployeeForPerformance(99)
        );
        assertEquals(baseBonus * 1.5, performanceBonus);
    }
}