package controller;

/**
 * Class to calculate the Exponent function
 * @author Neona Pinto
 */
public class ExponentFunction {
    /**
     * Calculate the result based on all test cases
     * @param x base
     * @param y power
     * @return the power of x ^ y
     */
    public static  double calculateResult(double x, double y) {
        double result = 1;
        double roots =1;
        double base_value =x;
        double power_value =y;
        // Power is integer simply multiply and return result
        if(power_value % 1 == 0)
        {
            for(int counter = 1; counter <= power_value; counter++)
            {
                result *= x;
            }
        }
        // Power is a decimal number
        else{
            // If power is greater than 1
            if(power_value >= 1)
            {
                double[] exponentialValue = findExponentialValue(base_value, power_value);
                roots *= exponentialValue[0];
                power_value = exponentialValue[1];
            }
            // If power is >0 and <1
            if(power_value>0 && power_value<1)
            {
                //updating power value up-to 8 decimal points
                String doubleString = String.format("%.8f", power_value);
                power_value = Double.parseDouble(doubleString);
                // now we work on the fractional part
                double den;
                for(den=1; power_value*den%1!=0;den++)
                {
                    continue;
                }
                double precision = 1;
                double findroot = findClosestRoot(base_value, den, 0, precision);
                while(base_value < findExponentialValue(findroot, den)[0] && precision > 0.000001) {
                    findroot -= precision;
                    precision *= 0.1;
                    findroot = findClosestRoot(base_value, den, findroot, precision);
                }
                double value = findExponentialValue(findroot, power_value * den)[0];
                roots *= value;
            }
            result = roots;
        }
        return result;
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
        double closestRoot = findClosestRoot(base, denominator, 0, precision);
        while(base < findExponentialValue(closestRoot, denominator)[0] && precision > 0.0000000000001) {
            closestRoot -= precision;
            precision *= 0.1;
            closestRoot = findClosestRoot(base, denominator, closestRoot, precision);
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
    public static double findClosestRoot(double base, double power, double closestRoot, double precision) {
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
        double exponent_val = 1;
        while(power > 0) {
            exponent_val = exponent_val * base;
            power--;
            if(power < 1) {
                break;
            }
        }
        return new double[]{exponent_val , power};
    }
}
