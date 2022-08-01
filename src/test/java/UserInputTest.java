import org.junit.Test;
import view.UserView;

import static org.junit.Assert.*;

/**
 * Class to test the user inputs
 * @author Neona Pinto
 */
public class UserInputTest extends UserView {
    /**
     * Test 1: input test for different types of input
     */
    @Test
    public void numericInputCheckTest() {
        assertTrue(UserView.numericInputCheck(12.3, 43));
        assertTrue(UserView.numericInputCheck(3, 6));
        assertFalse(UserView.numericInputCheck(-43, 89));
        assertFalse(UserView.numericInputCheck(-54, -56));
        assertFalse(UserView.numericInputCheck(54, -65));
        assertFalse(UserView.numericInputCheck(0, 0));
    }
}
