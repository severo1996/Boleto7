/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
class Boleto7 {
      int num;
    public void pedirNum(){
        num=Integer.parseInt( JOptionPane.showInputDialog("Inserte numero"));
        
        if(num >=0){ 
            JOptionPane.showMessageDialog(null,"Es positivo");
        }
        else
            JOptionPane.showMessageDialog(null,"Es negativo");
    }
}
