import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


// TODO: Auto-generated Javadoc
    /** The Class SuperCalculator. */
    public class Main extends JFrame {
        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;
        /** The text field input. */
        private static JTextField textFieldInput;



        /** Instantiates a new super calculator. */
        public Main() {
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
        }

        /**
         * The main method.
         *
         * @param args the arguments
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(
                    new Runnable() {
                        public void run() {
                            try {
                                Main frame = new Main();
                                // textField get focus
                                frame.addWindowFocusListener(
                                        new WindowAdapter() {
                                            public void windowGainedFocus(WindowEvent e) {
                                                textFieldInput.requestFocusInWindow();
                                            }
                                        });
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
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




