package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends  JFrame{
    private JPanel panel1;
    private JCheckBox cpizza;
    private JCheckBox cburger;
    private JCheckBox csoftDrinks;
    private JCheckBox cfries;
    private JCheckBox ctea;
    private JCheckBox csundae;
    private JCheckBox rbNone;
    private JCheckBox rb5;
    private JCheckBox rb10;
    private JCheckBox rb15;
    private JButton btnOrder;

    FoodOrderingSystem(){

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        FoodOrderingSystem food = new FoodOrderingSystem();
        food.setContentPane(food.panel1);
        food.setSize(550, 300);
        food.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
