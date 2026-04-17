import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjectsCompletionBonusTest {
    private BaseBonus base;
    private ProjectsCompletionBonus pcb;

    @BeforeEach
    void setup() {
        base = new BaseBonus();
        pcb = new ProjectsCompletionBonus(base);
    }

    @Test
    void shouldApplyBonus() {
        Employee julian = new Employee("Julian",4,10,2,18,true);
        double baseBonus = this.base.calculateBonus(julian);
        double withProjectCompletionBonus = this.pcb.calculateBonus(julian);
        double diff = withProjectCompletionBonus - baseBonus;
        assertEquals(200.0, diff);
    }

    @Test
    void shouldNotApplyBonus() {
        Employee julian = new Employee("Julian",4,10,0,18,false);
        double baseBonus = this.base.calculateBonus(julian);
        double withProjectCompletionBonus = this.pcb.calculateBonus(julian);
        double diff = withProjectCompletionBonus - baseBonus;
        assertEquals(0, diff);
    }
}
