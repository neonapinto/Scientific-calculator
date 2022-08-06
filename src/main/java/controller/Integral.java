package controller;
import constants.Constants;

/**
 * Class to calculate the Beta function B(x,y).
 * @author Neona Pinto.
 */
public class Integral { /**
     * Calculating the intergral function for performing the Beta function
     * B(x,y) = ∫ 0 to 1 (t ^ p-1 * (1-t) ^ q-1)dt
     * @param p part of the beta function
     * @param q part of the beta function
     * @param function function within the integral
     * @return the result of the integration
     */protected double integral(final double p, final double q, final IntegrationFunction function) {
        double area = 0;
        double modifier = 1;
        for(double i = (double) 0 + Constants.INCREMENT; i < (double) 1; i += Constants.INCREMENT) {
            double dFromA = i - (double) 0;
            area += (Constants.INCREMENT / 2) * (function.func((double) 0 + dFromA, p, q) + function.func((double) 0 + dFromA - Constants.INCREMENT, p, q));
        }
        return area * modifier;
    }
    /**
     * function to run the Beta function
     * @param x x value
     * @param y y value
     */
    public double BetaFunction(final double x, final double y){
        ExponentFunction exp = new ExponentFunction();
        double ans = -1;
        if(x > 0 && y > 0){
            ans = this.integral(x, y, (x1, p, q) -> (exp.calculateResult(x1, (p - 1))) * (exp.calculateResult((1- x1), (q-1))));
            double ans1 = this.integral(x, y, (x1, p, q) -> (Math.pow(x1, (p - 1))) * (Math.pow((1- x1), (q-1))));
            System.out.println(ans);
            System.out.println("B(" + x + "," + y + ") = ∫ 0 to 1 ((t ^ " + x +  "-1) * (1-t) ^ (" + y + "-1))dt \n" + ans);
        }
        else {
            System.out.println("Please enter positive values for x and y.");
        }
        return ans;
    }
}
