import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    private BonusService bs;

    @BeforeEach
    void setup() {
        bs = new BonusService();
    }

    @Test
    void shouldReturnMinWhenBonusIsTooLow() {
        assertEquals(500, bs.applyRestrictions(400));
    }

    @Test
    void shouldReturnMaxWhenBonusIsTooHigh() {
        assertEquals(2000, bs.applyRestrictions(2100));
    }
}
