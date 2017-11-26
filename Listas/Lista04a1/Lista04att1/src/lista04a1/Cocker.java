/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04a1;

import javax.swing.JOptionPane;

/**
 *
 * classe Cocker que estende a classe Cachorro e tem os atributos tosa do tipo boolean (falso, verdadeiro)
 */
public class Cocker extends Cachorro{
    protected boolean tosa;

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public void precisaTosa(){
        int opc = JOptionPane.showConfirmDialog(null,"Precisa de tosa?:",
          "Escolha um",JOptionPane.YES_NO_OPTION);
        if(opc==0){
            tosa = true;
        }else{
            tosa=false;
        }
    if(tosa==true){
        JOptionPane.showMessageDialog(null, "O Cão precisa de tosa");
    }else if(tosa==false){
        JOptionPane.showMessageDialog(null, "O Cão não precisa de tosa");

    }
}
}
