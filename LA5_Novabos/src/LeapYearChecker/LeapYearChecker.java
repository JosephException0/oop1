package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends  JFrame{
    private JPanel Message;
    private JTextField yearTextField;
    private JButton checkYearButton;

    LeapYearChecker(){
        setTitle("Leap Year Checker");
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yearTextField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Enter year");
                }
                int year= Integer.parseInt(yearTextField.getText());

                if(year % 4 == 0){
                    if(year % 100 == 0){
                        if(year % 400 == 0){
                            JOptionPane.showMessageDialog(null, "Leap Year");
                        }else{
                            JOptionPane.showMessageDialog(null, "Not Leap Year");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Not Leap Year");

                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker leap = new LeapYearChecker();
        leap.setContentPane(leap.Message);
        leap.setSize(300,150);
        leap.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        leap.setVisible(true);
    }
}
