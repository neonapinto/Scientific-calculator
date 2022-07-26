package Test;

public class ExponentialFunction {
    public static double myPow(double base, long exponent) {

        if (base == 0 && exponent == 0) {
            return 0;
        }

        if (base == 0 && exponent < 0) {

            throw new ArithmeticException("x = 0 and y is negative number " +
                    "will cause divide by zero exception");


        }

        if (base == 0 && exponent > 0) {
            return 0;
        }

        if (exponent == 0) {
            return 1;
        }

        if(exponent < 0){
            exponent = -exponent;
            base = 1 / base;
        }

        double result = 1;

        while(exponent != 0){
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException("the result exceeds the boundary");
            }

            if((exponent & 1) != 0) {
                result *= base;
            }

            base *= base;
            exponent >>>= 1;

        }

        return result;
    }
}
