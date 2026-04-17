import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowAbsenceBonusTest {

    private LowAbsenceBonus lowAbsenceBonus;
    private BaseBonus base;

    private Employee prepareEmployeeForLowAbsenceBonus(
            Integer yearsInCompany,
            Integer absenceDays
    ) {
        return new Employee(
                "Test",
                yearsInCompany,
                3,
                2,
                absenceDays,
                false
        );
    }

    @BeforeEach
    void setUp() {
        this.base = new BaseBonus();
        this.lowAbsenceBonus = new LowAbsenceBonus(this.base);
    }

    @Test
    void shouldNotGetLowAbsenceBonusWhenAbsentDaysAreOverAverage() {
        final Employee employee = prepareEmployeeForLowAbsenceBonus(1, 20);
        double lowAbsenceBonus = this.lowAbsenceBonus.calculateBonus(
                employee
        );
        double baseBonus = this.base.calculateBonus(
                employee
        );

        assertEquals(baseBonus, lowAbsenceBonus);
    }

    @Test
    void shouldGetLowAbsenceBonusWhenAbsentDaysAreUnderAverage() {
        final Employee employee = prepareEmployeeForLowAbsenceBonus(1, 14);
        double lowAbsenceBonus = this.lowAbsenceBonus.calculateBonus(
                employee
        );
        double baseBonus = this.base.calculateBonus(
                employee
        );

        assertEquals(baseBonus + 50, lowAbsenceBonus);
    }

    @Test
    void shouldGetLowAbsenceBonusWhenAbsentDaysAreUnderLowAverage() {
        final Employee employee = prepareEmployeeForLowAbsenceBonus(1, 3);
        double lowAbsenceBonus = this.lowAbsenceBonus.calculateBonus(
                employee
        );
        double baseBonus = this.base.calculateBonus(
                employee
        );

        assertEquals(baseBonus + 100, lowAbsenceBonus);
    }
}