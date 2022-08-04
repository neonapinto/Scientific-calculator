package controller;
import constants.Constants;

/**
 * Class to calculate the Beta function B(x,y)
 * @author Neona Pinto
 */
public class Integral {

    /**
     * Calculating the intergral function for performing the Beta function B(x,y) = ∫ 0 to 1 (t ^ p-1 * (1-t) ^ q-1)dt
     * @param a is the start limit
     * @param b is the end limit
     * @param p part of the beta function
     * @param q part of the beta function
     * @param function function within the integral
     * @return the result of the integration
     */
    public double integral(double a, double b, double p, double q,  IntegrationFunction function) {
        double area = 0;
        double modifier = 1;
        for(double i = a + Constants.INCREMENT; i < b; i += Constants.INCREMENT) {
            double dFromA = i - a;
            area += (Constants.INCREMENT / 2) * (function.func(a + dFromA, p, q) + function.func(a + dFromA - Constants.INCREMENT, p, q));
        }
        return area * modifier;
    }

    /**
     * function to run the Beta function
     * @param x x value
     * @param y y value
     */
    public double BetaFunction(double x, double y){
        Integral integral_obj = new Integral();
        double ans = -1;
        if(x > 0 && y > 0){
            ans = integral_obj.integral(0, 1, x, y, (x1, p, q) -> (ExponentFunction.calculateResult(x1, (p - 1))) * (ExponentFunction.calculateResult((1- x1), (q-1))));
            System.out.println("B(" + x + "," + y + ") = ∫ 0 to 1 ((t ^ " + x +  "-1) * (1-t) ^ (" + y + "-1))dt \n" + ans);
        }
        else {
            System.out.println("Please enter positive values for x and y.");
        }
        return ans;
    }
}
