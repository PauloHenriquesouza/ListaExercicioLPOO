/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

import javax.swing.JOptionPane;

public class Natal extends CartaoWeb {
    
    public void Natal(String destinario){
            
    }

    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String mensagem = String.format(" %s ,\n Feliz natal! \n Espero que nesse ano "
                + "seja cheio de luz e paz no coração, \n Atenciosamente %s.", destinatario, remetente);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
