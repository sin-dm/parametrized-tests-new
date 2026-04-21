//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//@RunWith(Parameterized.class)
//public class Junit4ParamsTest {
//
//    int firstNumber;
//
//    int secondNumber;
//
//    int expected;
//
//    public Junit4ParamsTest(int firstNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = firstNumber;
//        this.expected = firstNumber * 2;
//    }
//
//    @Parameterized.Parameters
//    public static Object[] parameters() {
//        return new Object[] {1, 1, 2};
//    }
//
//    @Test
//    public void sumTest() {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(firstNumber, secondNumber);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void nonParamTest() {
//        assertTrue(true);
//    }
//}
