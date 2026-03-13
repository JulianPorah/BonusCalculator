import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    void shouldReturnMinWhenBonusIsTooLow() {
        BonusService bs = new BonusService();
        assertEquals(500, bs.applyRestrictions(400));
    }
}
