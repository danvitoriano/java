/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praticas5a;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Danilo
 */
public class Praticas5a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame window = new JFrame("JFrame Window");
        JLabel txt = new JLabel("JLabel Plain Text");
        JButton click = new JButton();
        JTextField field = new JTextField(15);
        JComboBox options = new JComboBox();
        options.addItem("John");
        options.addItem("Mary");
        click.setText("JButton");
        
        window.setLayout(new FlowLayout());
        window.add(txt);
        window.add(click);
        window.add(field);
        window.add(options);
        
        window.setSize(800,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
}
