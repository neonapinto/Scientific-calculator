package Test;

public class Integral {

    public static final double INCREMENT = 1E-4;

    public static void main(String[] args) {

        System.out.println(integral(0, 1, 5, 8,  new Function() {
            @Override
            public double f(double x, double p, double q) {
                return Math.pow(x, (p - 1)) *  Math.pow((1-x), (q-1));
            }
        }));
    }

    public static double integral(double a, double b, double p, double q,  Function function) {
        double area = 0;
        double modifier = 1;
        if(a > b) {
            double tempA = a;
            a = b;
            b = tempA;
            modifier = -1;
        }
        for(double i = a + INCREMENT; i < b; i += INCREMENT) {
            double dFromA = i - a;
            area += (INCREMENT / 2) * (function.f(a + dFromA, p, q) + function.f(a + dFromA - INCREMENT, p, q));
        }
        return (Math.round(area * 1000.0) / 1000.0) * modifier;
    }
}
