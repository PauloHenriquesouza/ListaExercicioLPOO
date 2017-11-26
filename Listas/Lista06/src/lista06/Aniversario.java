/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

import javax.swing.JOptionPane;

public class Aniversario extends CartaoWeb {

    public void Aniversario(String destinatario){
        
    }
    
    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String mensagem = String.format(" %s ,\n Feliz Aniversário! \n Te desejo "
                + "muita paz, saúde, felicidade e muito amor \n Atenciosamente %s", destinatario, remetente);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
