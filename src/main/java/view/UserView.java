package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserView extends JFrame{
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /** The text field input. */
    private static JTextField textFieldInput;
    /** The button zero. */
    private JButton buttonZero;
    /** buttonOne. */
    private JButton buttonOne;
    /** buttonTwo. */
    private JButton buttonTwo;
    /** buttonThree. */
    private JButton buttonThree;
    /** buttonFour. */
    private JButton buttonFour;
    /** buttonFive. */
    private JButton buttonFive;
    /** buttonSix. */
    private JButton buttonSix;
    /** buttonSeven. */
    private JButton buttonSeven;
    /** buttonEight. */
    private JButton buttonEight;
    /** buttonNine. */
    private JButton buttonNine;



    /** Instantiates a new super calculator. */
    public UserView() {
        setResizable(true);
        setFont(new Font("Dialog", Font.BOLD, 14));
        setTitle("Super Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 515, 415);
        getContentPane().setLayout(null);

        textFieldInput = new JTextField();
        textFieldInput.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldInput.setFont(new Font("Tahoma", Font.BOLD, 20));
        textFieldInput.setBounds(21, 35, 472, 35);
        textFieldInput.setBorder(null);
        getContentPane().add(textFieldInput);
        textFieldInput.setColumns(10);

        buttonZero = new JButton("0");
        buttonZero.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "0");
                    }
                });
        buttonZero.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonZero.setBounds(21, 290, 56, 35);
        getContentPane().add(buttonZero);

        buttonOne = new JButton("1");
        buttonOne.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "1");
                    }
                });
        buttonOne.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonOne.setBounds(21, 235, 56, 35);
        getContentPane().add(buttonOne);

        buttonTwo = new JButton("2");
        buttonTwo.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "2");
                    }
                });
        buttonTwo.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonTwo.setBounds(87, 235, 56, 35);
        getContentPane().add(buttonTwo);

        buttonThree = new JButton("3");
        buttonThree.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "3");
                    }
                });
        buttonThree.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonThree.setBounds(153, 235, 56, 35);
        getContentPane().add(buttonThree);

        buttonFour = new JButton("4");
        buttonFour.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "4");
                    }
                });
        buttonFour.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonFour.setBounds(21, 187, 56, 35);
        getContentPane().add(buttonFour);

        buttonFive = new JButton("5");
        buttonFive.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "5");
                    }
                });
        buttonFive.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonFive.setBounds(87, 187, 56, 35);
        getContentPane().add(buttonFive);

        buttonSix = new JButton("6");
        buttonSix.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "6");
                    }
                });
        buttonSix.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonSix.setBounds(153, 187, 56, 35);
        getContentPane().add(buttonSix);

        buttonSeven = new JButton("7");
        buttonSeven.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "7");
                    }
                });
        buttonSeven.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonSeven.setBounds(21, 141, 56, 35);
        getContentPane().add(buttonSeven);

        buttonEight = new JButton("8");
        buttonEight.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "8");
                    }
                });
        buttonEight.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonEight.setBounds(87, 141, 56, 35);
        getContentPane().add(buttonEight);

        buttonNine = new JButton("9");
        buttonNine.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        textFieldInput.setText(textFieldInput.getText() + "9");
                    }
                });
        buttonNine.setFont(new Font("Tahoma", Font.BOLD, 20));
        buttonNine.setBounds(153, 141, 56, 35);
        getContentPane().add(buttonNine);
    }

    public JTextField getTextFieldInput(){
        return this.textFieldInput;
    }


    /**
     * Checks if input is a Number.
     *
     * @param inputDataString the inputDataString
     * @return true, if the input is a real number
     */
    public static boolean numericInputCheck(String inputDataString) {
        return true;
    }

    /**
     * Arithmetic operation.
     *
     * @param str the str
     */
    public void arithmeticOperation(String str) {

    }
}
