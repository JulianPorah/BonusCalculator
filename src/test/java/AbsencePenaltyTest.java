import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsencePenaltyTest {
    private BaseBonus base;
    private AbsencePenalty absencePenalty;

    @BeforeEach
    void setup() {
        this.base = new BaseBonus();
        this.absencePenalty = new AbsencePenalty(base);
    }

    @Test
    void shouldApplyBonus() {
        Employee julian = new Employee("Julian", 4, 10, 2, 18, true);
        double baseBonus = this.base.calculateBonus(julian);
        double withAbsencePenalty = this.absencePenalty.calculateBonus(julian);
        double diff = withAbsencePenalty - baseBonus;
        assertEquals(-90.0, diff);
    }

    @Test
    void shouldNotApplyBonus() {
        Employee julian = new Employee("Julian", 0, 10, 2, 0, false);
        double baseBonus = this.base.calculateBonus(julian);
        double withAbsencePenalty = this.absencePenalty.calculateBonus(julian);
        double diff = withAbsencePenalty - baseBonus;
        assertEquals(0.0, diff);
    }
}
