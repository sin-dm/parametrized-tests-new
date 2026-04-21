import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebugTest {

    Calculator calculator = new Calculator();

    @Test
    public void debugTest() {
        assertEquals(3, calculator.sum(1, 2));
    }
}
