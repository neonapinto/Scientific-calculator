import controller.Integral;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for testing Beta function
 * @author  Neona Pinto
 */
public class IntegralTest extends Integral {
    /**
     * Test 1: Testing with integer values
     */
    @Test
    public void testBetaFunctionWithIntValues(){
        assertEquals(0.0166667, BetaFunction(3,4) , 0.001);
    }

    /**
     * Test 2: Testing with double values
     */
    @Test
    public void testBetaFunctionWithDoubleValues(){
        assertEquals(0.0084110, BetaFunction(3.4,4.5) , 0.001);
    }

    /**
     * Test 3: Testing with negative values
     * negative value returns -1 and displays message
     */
    @Test
    public void testBetaFunctionWithNegativeValues(){
        assertEquals(-1, BetaFunction(-3.4,-4.5) , 0.001);
    }

    /**
     * Test 4: Testing with one negative parameter
     * negative value returns -1 and displays message
     */
    @Test
    public void testBetaFunctionWithOneNegativeValues(){
        assertEquals(-1, BetaFunction(3.4,-4.5) , 0.001);
    }

    /**
     * Test 4: Testing with one negative parameter
     * zero values returns -1 and displays message
     */
    @Test
    public void testBetaFunctionWithZeroValues(){
        assertEquals(-1, BetaFunction(0,0) , 0);
    }

}
