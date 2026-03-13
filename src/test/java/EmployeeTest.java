import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void shouldReturnYearsInCompany() {
        Employee employee = new Employee();
        employee.setYearsInCompany(4);
        assertEquals(4, employee.getYearsInCompany());
    }

}