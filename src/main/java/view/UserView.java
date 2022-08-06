/**
 * view package for the user inputs
 */
package view;

import controller.Integral;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class for the User Cli for the user.
 * @author  Neona Pinto
 * @version v1.0.0
 */

public class UserView {
    /**
     * function to test if the input is valid or not
     * @param x value
     * @param y value
     * @return
     */
    public static boolean numericInputCheck(final double x, final double y) {
        try {
            if(x >0 && y > 0) {
                return true;
            }
            else{
                System.out.println("Please enter positive values.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid values - real numbers.");
            return false;
        }
        return false;
    }

    /**
     * driver to run the cli
     */
    public static void runFunction() {
        Integral integral = new Integral();
        int input = 0;
        do{

            System.out.println("--------------------------------------------------- \n" +
                    "Welcome to the Beta function calculator!");
            Scanner sc = new Scanner(System.in);
            System.out.println("""
                    Enter what you would like to choose:
                    1.Perform Beta Function B(x,y):
                    2.Get information on Beta function.\s
                    3.Quit.""");
            try{
                input = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Enter the correct menu option.");
            }
            switch (input) {
                case 1 -> {
                    try{
                        System.out.println("Enter the value of x:");
                        double x = sc.nextDouble();
                        System.out.println("Enter the value of y:");
                        double y = sc.nextDouble();
                        if (numericInputCheck(x, y)) {
                            integral.BetaFunction(x, y);
                        } else {
                            System.out.println("Please enter valid inputs.");
                        }
                    }
                    catch (InputMismatchException e) {
                        System.out.println("Please enter valid inputs.");
                    }
                }
                case 2 -> System.out.println("""
                        Beta Function is also known as Euler Integral of the first kind.
                        Beta Function can also be expressed in terms of the gamma function. 
                        It is a function of two variables that are usually expressed as improper integrals.\s
                        It is equal to the quotient of the product of the values of the gamma function at each variable.
                        Example:
                        Calculate the Beta Function for the given details.
                        X – value (x) = 5
                        Y - value (y) = 10
                        Solution:
                        Apply Formula:
                        B(x,y) = ∫0 to 1 (t ^ x-1 * (1-t) ^ y-1 )dt
                        Beta Value (β) = 0.0000999""");
                case 3 -> {
                    System.out.println("Thank you for using the beta calculator.");
                    return;
                }
                default -> System.out.println("Enter a valid choice.");
            }
        } while (input < 3);
    }
}
