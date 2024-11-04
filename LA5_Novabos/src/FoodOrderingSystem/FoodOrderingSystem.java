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
    int[] prices = {100, 80 , 65 , 55, 50, 40};
    float[] discount = {0f, 0.05f, 0.10f, 0.15f};
    JCheckBox[] foodies = {cpizza, cburger, csoftDrinks, cfries, ctea, csundae ,};
    JCheckBox[] dis= {rbNone, rb5, rb10, rb15};
        setTitle("Food Ordering System");
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float total = 0.00F;
                for(int i=0; i< foodies.length; i++){
                    if(foodies[i].isSelected()){
                        total+= prices[i];
                    }
                }

                for(int i = 0; i < dis.length; i++){
                    if(dis[i].isSelected()){
                        total = total - (total * discount[i]);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, String.format("%.2f",total));
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
