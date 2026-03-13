import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusDecoratorTest {
    @Test
    void shouldBeInstanceOfBonus() {
        assertTrue(Bonus.class.isAssignableFrom(BonusDecorator.class));
    }
}
