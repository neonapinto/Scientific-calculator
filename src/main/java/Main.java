import view.UserView;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;



/** The Class SuperCalculator. */
    public class Main extends JFrame {
        public static void main(String[] args) {
            EventQueue.invokeLater(
                    new Runnable() {
                        public void run() {
                            try {
                                UserView frame = new UserView();
                                // textField get focus
                                frame.addWindowFocusListener(
                                        new WindowAdapter() {
                                            public void windowGainedFocus(WindowEvent e) {
                                                frame.getTextFieldInput().requestFocusInWindow();
                                            }
                                        });
                                frame.setVisible(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
        }
    }




