package controller;

/**
 * The Class PowerFunction related to the implementation of function F7, Power Function x^y.
 *
 * @author Manimaran
 */
public class ExponentialFunction {

    /**
     * Calculate.
     *
     * @param firstRealNumber the first real number
     * @param secondRealNumber the second real number
     * @return the double
     */
    public static double calculate(double firstRealNumber, double secondRealNumber) {
        double result = 1.0;
        result = power(result, firstRealNumber, secondRealNumber);
        final double baseFraction = secondRealNumber - (int) secondRealNumber;
        if (baseFraction > 0.1f) {
            final int result1 = (int) (Double.doubleToLongBits(firstRealNumber) >> 32);
            final int result2 = (int) (baseFraction * (result1 - 1072632447) + 1072632447);
            return result * Double.longBitsToDouble(((long) result2) << 32);
        }
        return result;
    }

    /**
     * Power.
     *
     * @param power the power
     * @param firstRealNumber the first real number
     * @param secondRealNumber the second real number
     * @return the double
     */
    static double power(double power, double firstRealNumber, double secondRealNumber) {
        int exponent = (int) secondRealNumber;
        double base = firstRealNumber;
        while (exponent != 0) {
            if ((exponent & 1) != 0) {
                power *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return power;
    }
}
