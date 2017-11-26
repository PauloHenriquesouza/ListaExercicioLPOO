/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05;

import javax.swing.JOptionPane;

public class Net extends Computador{
    protected boolean internet;

    public void setinternet(boolean internet) {
        this.internet = internet;
    }
    
    public void Teminternet(){
        int opc = JOptionPane.showConfirmDialog(null,"Voce possui internet?:",
          "Escolha um",JOptionPane.YES_NO_OPTION);
        if(opc==0){
            internet = true;
        }else{
            internet=false;
        }
    if(internet==true){
        JOptionPane.showMessageDialog(null, "Voce tem acesso");
    }else if(internet==false){
        JOptionPane.showMessageDialog(null, "Voce não te acesso");

    }
    }}
