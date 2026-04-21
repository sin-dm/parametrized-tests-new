//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
 //@ExtendWith(MyExtension.class)
//public class ParametrizedTest {
//
//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
//    public void valueSourceTest(int x) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(x, 1);
//        int expected = x + 1;
//        if (x % 2 == 0) {
//            expected = x + 3;
//        }
//        assertEquals(expected, result);
//    }
//
//    @ParameterizedTest
//    @NullAndEmptySource
//    public void nullAndBlankTest(String str) {
//        if (str != null) {
//            System.out.println("Blank str" + str); //""
//        }
//        assertTrue(str.isBlank());
//    }
//
//    @ParameterizedTest
////    @CsvSource({
////            "1, 1, 2",
////            "2, 2, 4",
////            "3, 5, 8"
////    })
//    @CsvFileSource
//    public void csvSourceTest(int number, int secondNumber, int expected) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(number, secondNumber);
//        assertEquals(expected, result + 1);
//    }
//
//    @ParameterizedTest
//    @MethodSource("numbersForCalculator")
//    public void methodSourceTest(int firstNumber, int secondNumber, int expected) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(firstNumber, secondNumber);
//        assertEquals(expected, result);
//    }
//
//    @ParameterizedTest(name = "Test round: {index} | sum {0} with {1} expected {2}")
//    @MethodSource("numbersForCalculator")
//    public void methodSourceWithDescTest(int firstNumber, int secondNumber, int expected) {
//        Calculator calculator = new Calculator();
//        int result = calculator.sum(firstNumber, secondNumber);
//        assertEquals(expected, result);
//    }
//
//    public static Stream<Arguments> numbersForCalculator() {
//        //любой код или вызов других методов
//        return Stream.of(
//                Arguments.arguments(1, 1, 2),
//                Arguments.arguments(2, 2, 4),
//                Arguments.arguments(3, 5, 8)
//        );
//    }
//}
