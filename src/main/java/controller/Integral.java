package controller;

import constants.Constants;
import java.util.Formatter;

public class Integral {

    public static void main(String[] args) {
        ExponentialFunction Exponent = new ExponentialFunction();
        Formatter f1 = new Formatter();
       double ans = integral(0, 1, 2.5, 43.3,  new BetaFunction() {
            @Override
            public double f(double x, double p, double q) {
//                return (Exponent.calculate(x, (p - 1))) * (Exponent.calculate((1-x), (q-1)));
                return (ExponentialFunction.power(x, (p - 1))) * (ExponentialFunction.power((1-x), (q-1)));
            }
        });
       f1.format("%.10f", ans);
       System.out.println(f1);
    }

    public static double integral(double a, double b, double p, double q,  BetaFunction function) {
        double area = 0;
        double modifier = 1;
        if(a > b) {
            double tempA = a;
            a = b;
            b = tempA;
            modifier = -1;
        }
        for(double i = a + Constants.INCREMENT; i < b; i += Constants.INCREMENT) {
            double dFromA = i - a;
            area += (Constants.INCREMENT / 2) * (function.f(a + dFromA, p, q) + function.f(a + dFromA - Constants.INCREMENT, p, q));
        }
        return ((area * 1000.0) / 1000.0) * modifier;
    }
}
