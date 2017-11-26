/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05;

import javax.swing.JOptionPane;

public class Ligação extends Telefone{
    protected boolean Credito;

    public void setinternet(boolean internet) {
        this.Credito = internet;
    }
    
    public void TemCredito(){
        int opc = JOptionPane.showConfirmDialog(null,"Voce possui internet?:",
          "Escolha um",JOptionPane.YES_NO_OPTION);
        if(opc==0){
            Credito = true;
        }else{
            Credito=false;
        }
    if(Credito==true){
        JOptionPane.showMessageDialog(null, "Voce pode ligar");
    }else if(Credito==false){
        JOptionPane.showMessageDialog(null, "Voce não pode ligar");

    }
}
}
