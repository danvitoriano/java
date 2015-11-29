/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

/**
 *
 * @author Danilo
 */
class ContaCorrente {
    float saldo = 0;
    float limite = 300;
    float disponivel;
    
    public void sacar(float quantia) throws IllegalArgumentException{
        if (quantia <= disponivel) {
            saldo = saldo - quantia;
            disponivel = saldo + limite;
        } else{
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
    
    public void depositar(float quantia){
        
        if (quantia > 0){
            saldo = saldo + quantia;
            disponivel = saldo + limite;
        } else{
            throw new IllegalArgumentException("Depósito nulo");
        }
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public float getDisponivel(){
        return disponivel;
    }
    
    public float getLimite(){
        return limite;
    }
    
}
