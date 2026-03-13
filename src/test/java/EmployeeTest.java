import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setup() {
        this.employee = new Employee();
    }

    @Test
    void shouldReturnYearsInCompany() {
        this.employee.setYearsInCompany(4);
        assertEquals(4, employee.getYearsInCompany());
    }

    @Test
    void shouldReturnPerformancePoints() {
        this.employee.setPerformancePoints(10);
        assertEquals(10,employee.getPerformancePoints());
    }

}