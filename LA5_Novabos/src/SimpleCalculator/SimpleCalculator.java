package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField tfNumber1;
    private JPanel panel1;
    private JComboBox<String> cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JButton btnCompute;

    SimpleCalculator() {



        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operation = (String) cbOperations.getSelectedItem();
                if(tfNumber1.getText().isEmpty() || tfNumber1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "input numbers");
                    return;
                }
                double a = Double.parseDouble(tfNumber1.getText());
                double b = Double.parseDouble(tfNumber2.getText());
                double result = 0;


                switch (operation) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            lblResult.setText("Error: Divide by zero");
                            return;
                        }
                        result = a / b;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Enter operation");
                        break;
                }

                lblResult.setText(String.valueOf(result));
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        cal.setContentPane(cal.panel1);
        cal.setSize(550, 300);
        cal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cal.setVisible(true);
    }
}
