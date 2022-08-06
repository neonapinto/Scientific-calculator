import controller.ExponentFunction;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for testing exponent number
 * @author  Neona Pinto
 */
public class ExponentTest extends ExponentFunction {
    /**
     * Test Case 1: Test cases for Requirement 3: test if X(Positive Number)
     */
    @Test
    public void positiveNumberPowerofPositiveNumber() {
        assertEquals(Math.pow(5,9), calculateResult(5, 9), 0);
    }

    /**
     * Test Case 2: cases for Requirement 3:  test if X(0) to the power of
     * Y(0)=1.0
     */
    @Test
    public void zeroPowerofZero() {
        assertEquals(Math.pow(0,0), calculateResult(0, 0), 0);
    }

    /**
     * Test Case 3:  Test cases for Requirement 3: test if X(0) to the power of
     * Y(Real Number)=0.0
     */
    @Test
    public void zeroPowerofRealNumber() {
        assertEquals(Math.pow(0,3), calculateResult(0, 3), 0);
    }

    /**
     * Test Case 4:  Test cases for Requirement 3:  test if X(Positive Number)
     * to the power of Y(0)=1.0
     */
    @Test
    public void positiveNumberPowerofZero() {
        assertEquals(Math.pow(7,0), calculateResult(7, 0), 0);
    }

    /**
     * Test Case 5: Test cases for Requirement 3:  test if X(Negative Number)
     * to the power of Y (0)=1.0
     */
    @Test
    public void negativeNumberPowerofZero() {
        assertEquals(Math.pow(-4,0), calculateResult(-4, 0), -1);
    }

    /**
     * Test Case 6: Test cases for Requirement 3: test if X(Positive Number)
     */
    @Test
    public void positiveNumberPowerofOne() {
        assertEquals(Math.pow(7,1), calculateResult(7, 1), 0);
    }

}
