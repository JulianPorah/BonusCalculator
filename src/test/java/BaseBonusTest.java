import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseBonusTest {

    @Test
    void shouldBeInstanceOfBonus() {
        assertTrue(Bonus.class.isAssignableFrom(BaseBonus.class));
    }
}
