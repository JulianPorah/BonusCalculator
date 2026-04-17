import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectsCompletionBonusTest {

    @Test
    void shouldApplyBonus() {
        Employee julian = new Employee("Julian",4,10,2,18,true);
        BaseBonus base = new BaseBonus();
        ProjectsCompletionBonus pcb = new ProjectsCompletionBonus(base);
        double baseBonus = base.calculateBonus(julian);
        double withProjectCompletionBonus = pcb.calculateBonus(julian);
        double diff = withProjectCompletionBonus - baseBonus;
        assertEquals(200.0, diff);
    }
}
