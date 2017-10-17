/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodMood.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author cmgoe
 */
public abstract class ParentFrame extends JFrame{
    
    public ParentFrame () {
        this.setVisible(true);
        this.setSize(1000, 700);
        this.setTitle("FoodMood");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("foodmoodicon.png").getImage());
    }
}
