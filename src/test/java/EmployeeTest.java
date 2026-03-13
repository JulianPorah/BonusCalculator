import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setup() {
        this.employee = new Employee();
    }

    @Test
    void shouldReturnYearsInCompany() {
        this.employee.setYearsInCompany(4);
        assertEquals(4, this.employee.getYearsInCompany());
    }

    @Test
    void shouldReturnPerformancePoints() {
        this.employee.setPerformancePoints(10);
        assertEquals(10,this.employee.getPerformancePoints());
    }

    @Test
    void shouldReturnCompletedProjects() {
        this.employee.setCompletedProjects(2);
        assertEquals(2,this.employee.getCompletedProjects());
    }

    @Test
    void shouldReturnAbsenceDays() {
        this.employee.setAbsenceDays(18);
        assertEquals(18,this.employee.getAbsenceDays());
    }

    @Test
    void shouldReturnTrueWhenEmployeeIsTeamLeader() {
        this.employee.setTeamLeader(true);
        assertTrue(this.employee.getIsTeamLeader());
    }

    @Test
    void shouldReturnName() {
        this.employee.setName("Julian");
        assertEquals("Julian",this.employee.getName());
    }

}