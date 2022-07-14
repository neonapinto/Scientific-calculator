package model;

import view.Inputs;

interface CalculatorInterface {
    /**
     * Method runFunction runs the general steps of using a function
     */
    default void runFunction() {

    }

    /**
     * Method getInputs, to get user inputs
     * @return Inputs
     */
    Inputs getInputs();

    /**
     * Method calculateResult, to calculate result
     */
    void calculateResult();

    /**
     * Method displayResult, to display result
     */
    void displayResult();

}
