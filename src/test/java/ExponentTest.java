import controller.ExponentFunction;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for testing exponent number
 * @author  Neona Pinto
 */
public class ExponentTest extends ExponentFunction {

    /**
     * Test Case 1: cases for Requirement 1:  test if X(0) to the power of
     * Y(0)=1.0
     */
    @Test
    public void zeroPowerofZero() {
        assertEquals(1.0, calculateResult(0, 0), 0);
    }

    /**
     * Test Case 2:  Test cases for Requirement 2: test if X(0) to the power of
     * Y(Real Number)=0.0
     */
    @Test
    public void zeroPowerofRealNumber() {
        assertEquals(0.0, calculateResult(0, 3), 0);
    }

    /**
     * Test Case 3:  Test cases for Requirement 3:  test if X(Positive Number)
     * to the power of Y(0)=1.0
     */
    @Test
    public void positiveNumberPowerofZero() {
        assertEquals(1.0, calculateResult(7, 0), 0);
    }

    /**
     * Test Case 4: Test cases for Requirement 4:  test if X(Negative Number)
     * to the power of Y (0)=1.0
     */
    @Test
    public void negativeNumberPowerofZero() {
        assertEquals(1.0, calculateResult(-4, 0), -1);
    }

    /**
     * Test Case 5: Test cases for Requirement 5: test if X(Positive Number)
     */
    @Test
    public void positiveNumberPowerofOne() {
        assertEquals(7.0, calculateResult(7, 1), 0);
    }

    /**
     * Test Case 6: Test cases for Requirement 6: test if X(Positive Number)
     */
    @Test
    public void positiveNumberPowerofPositiveNumber() {
        assertEquals(1953125.0, calculateResult(5, 9), 0);
    }

    /**
     * Test Case 7: Test cases for Requirement : test if X(Negative Number)
     */
    @Test
    public void negativeNumberPowerofPositiveEvenNumber() {
        assertEquals(81, calculateResult(-3, 4), -1);
    }

    /**
     * Test Case 8: Test cases for Requirement : test if X(Negative Number)
     */
    @Test
    public void negativeNumberPowerofPositiveOddNumber() {
        assertEquals(-729, calculateResult(-9, 3), 0);
    }
}
