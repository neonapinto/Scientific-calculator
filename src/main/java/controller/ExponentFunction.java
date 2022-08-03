package controller;

/**
 * Class to calculate the Exponent function
 * @author Neona Pinto
 */
public class ExponentFunction {
    /**
     * Caculaate the result based on all test cases
     * @param x base
     * @param y power
     * @return the power of x ^ y
     */
    public static double calculateResult(double x, double y) {
        double minusY = y;
        double result = 1;

        //CASE 1: Power is a positive integer
        if(y % 1 == 0 && y > 0) {
            for(int i = 1; i <= y; i++) {
                result *= x;
            }
        }
        //CASE 2: Power is a fraction e.g. square root, cube root etc.
        else if(y % 1 != 0) {
            //negative fraction power
            if(y < 0) {
                minusY = -1 * y;
                double root = findRoot(x, minusY);
                String xRoot = String.format("%.10f", root);
                root = Double.parseDouble(xRoot);
                result = 1 / root;

                //positive fraction power
            }else if(y >= 0) {
                double root = findRoot(x, minusY);
                String xString = String.format("%.10f", root);
                root = Double.parseDouble(xString);
                result = root;
            }
        }
        return result;
    }

    /**
     * Returns the root of the base value
     *
     * @param base whose power is to be calculated
     * @param power the exponent value
     * @return the root of the base argument
     */
    static double findRoot(double base, double power) {
        double resultOfRoot = 1;
        if(power >= 1) {
            double[] exponentialValue = findExponentialValue(base, power);
            resultOfRoot *= exponentialValue[0];
            power = exponentialValue[1];
        }
        //fraction power remaining
        if(power > 0 && power < 1) {
            //formatting up to 10 decimal places
            String xString = String.format("%.10f", power);
            power = Double.parseDouble(xString);
            double[] fraction = getFractionPart(power);
            double denominator = root(base, fraction[1]);
            resultOfRoot *= findExponentialValue(denominator, fraction[0]*fraction[1])[0];
        }
        return resultOfRoot;
    }

    /**
     * Returns the array with fraction part
     *
     * @param num number for which to get fraction
     *
     * @return the array of fraction parts
     */
    public static double[] getFractionPart(double num) {
        double denominator = 1;
        while(!((num * denominator) % 1 == 0))
        {
            denominator++;
        }
        return new double[]{num, denominator};
    }

    /**
     * Returns the closestRoot with precision
     *
     * @param base base for exponent
     * @param denominator for the exponent
     *
     * @return the closest root
     */
    public static double root(double base, double denominator) {
        double precision = 1;
        double closestRoot = findClosestRootWithPrecision(base, denominator, 0, precision);
        while(base < findExponentialValue(closestRoot, denominator)[0] && precision > 0.0000000000001) {
            closestRoot -= precision;
            precision *= 0.1;
            closestRoot = findClosestRootWithPrecision(base, denominator, closestRoot, precision);
        }
        return closestRoot;
    }

    /**
     * Returns the closest root with precision
     *
     * @param base for exponent
     * @param power for exponent
     * @param closestRoot closest value to the root
     * @param precision range of precision
     *
     * @return the closest root with precision
     */
    public static double findClosestRootWithPrecision(double base, double power, double closestRoot, double precision) {
        closestRoot +=precision;
        double[] temp = findExponentialValue(closestRoot, power);
        while(temp[0] < base) {
            closestRoot += precision;
            temp = findExponentialValue(closestRoot, power);
        }
        return closestRoot;
    }

    /**
     * Returns the exponential value for the base and power
     * @param base for the exponent
     * @param power for the exponent
     * @return the parts of exponential value
     */
    public static double[] findExponentialValue(double base, double power) {
        double result = 1;
        while(power > 0) {
            result *= base;
            power--;
            if(power < 1) {
                break;
            }
        }
        return new double[]{result , power};
    }
}
