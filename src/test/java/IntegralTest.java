import controller.ExponentFunction;
import controller.Integral;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for testing Beta function
 * @author  Neona Pinto
 */
public class IntegralTest extends Integral {
    ExponentFunction exp = new ExponentFunction();
    /**
     * Test 1: Testing with integer values for Requirement R1
     */
    @Test
    public void testBetaFunctionWithPositiveValues(){
        assertEquals(0.0166667, BetaFunction(3,4) , 0.001);
    }

    /**
     * Test 2: Testing with double values Requirement R1
     */
    @Test
    public void testBetaFunctionWithDoubleValues(){
        assertEquals(0.0084110, BetaFunction(3.4,4.5) , 0.001);
    }

    /**
     * Test 2: Testing with double values for Requirements R2
     */
    @Test
    public void testBetaFunctionWithIntegralFunction(){
        assertEquals(0.0084110, integral(3.4, 4.5, (x1, p, q) -> (exp.calculateResult(x1, (p - 1))) * (exp.calculateResult((1- x1), (q-1)))), 0.001);
    }


    /**
     * Test 3: Testing with negative values Requirement R1
     * negative value returns -1 and displays message
     */
    @Test
    public void testBetaFunctionWithNegativeValues(){
        assertEquals(-1, BetaFunction(-3.4,-4.5) , 0.001);
    }

    /**
     * Test 4: Testing with one negative parameter Requirement R1
     * negative value returns -1 and displays message
     */
    @Test
    public void testBetaFunctionWithOneNegativeValues(){
        assertEquals(-1, BetaFunction(3.4,-4.5) , 0.001);
    }

    /**
     * Test 4: Testing with one negative parameter Requirement R1
     * zero values returns -1 and displays message
     */
    @Test
    public void testBetaFunctionWithZeroValues(){
        assertEquals(-1, BetaFunction(0,0) , 0);
    }

    @Before
    public void setUp() throws Exception {

    }

}
