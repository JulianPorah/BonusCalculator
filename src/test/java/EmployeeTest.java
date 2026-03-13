import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setup() {
        this.employee = new Employee("Julian",4,10,2,18,true);
    }

    @Test
    void shouldReturnYearsInCompany() {
        assertEquals(4, this.employee.getYearsInCompany());
    }

    @Test
    void shouldReturnPerformancePoints() {
        assertEquals(10,this.employee.getPerformancePoints());
    }

    @Test
    void shouldReturnCompletedProjects() {
        assertEquals(2,this.employee.getCompletedProjects());
    }

    @Test
    void shouldReturnAbsenceDays() {
        assertEquals(18,this.employee.getAbsenceDays());
    }

    @Test
    void shouldReturnTrueWhenEmployeeIsTeamLeader() {
        assertTrue(this.employee.getIsTeamLeader());
    }

    @Test
    void shouldReturnName() {
        assertEquals("Julian",this.employee.getName());
    }
}