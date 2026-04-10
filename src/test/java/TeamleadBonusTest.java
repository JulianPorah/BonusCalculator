import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamleadBonusTest {
    private BaseBonus base;
    private TeamleadBonus tlb;

    @BeforeEach
    void setup() {
        this.base = new BaseBonus();
        this.tlb = new TeamleadBonus(base);
    }

    @Test
    void shouldApplyBonus() {
        Employee julian = new Employee("Julian",4,10,2,18,true);
        double baseBonus = this.base.calculateBonus(julian);
        double withTeamleadBonus = this.tlb.calculateBonus(julian);
        double diff = withTeamleadBonus - baseBonus;
        assertEquals(150.0, diff);
    }

    @Test
    void shouldNotApplyBonus() {
        Employee julian = new Employee("Julian",4,10,2,18,false);
        double baseBonus = this.base.calculateBonus(julian);
        double withTeamleadBonus = this.tlb.calculateBonus(julian);
        double diff = withTeamleadBonus - baseBonus;
        assertEquals(0, diff);
    }
}
