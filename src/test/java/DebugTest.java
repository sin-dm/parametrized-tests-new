import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebugTest {

    Calculator calculator = new Calculator();

    @Test
    public void debugTest() {
        int result = calculator.sum(1, 2);
        assertEquals(3, result);
    }
}
