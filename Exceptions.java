/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente minhaConta = new ContaCorrente();
        float deposito = 0;
        String strDeposito = JOptionPane.showInputDialog("Quantia a depositar:");
        deposito = deposito + Float.parseFloat(strDeposito);
        minhaConta.depositar(deposito);
        try{
            minhaConta.sacar(1000);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Consulte seu gerente para linhas de credito");
        }
        JOptionPane.showMessageDialog(null, "Saldo" + minhaConta.getSaldo());
        JOptionPane.showMessageDialog(null, "Disponível" + minhaConta.getDisponivel());
        JOptionPane.showMessageDialog(null, "Limite" + minhaConta.getLimite());
        
    }
    
    
    
    
}
