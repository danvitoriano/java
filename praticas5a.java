/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praticas5a;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
        JFrame janela = new JFrame("JFrame Window");
        JLabel txt = new JLabel("JLabel Plain Text");
        janela.add(txt);
        janela.setSize(800,500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
