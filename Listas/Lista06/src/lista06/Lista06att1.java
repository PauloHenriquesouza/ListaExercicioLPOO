/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

import java.util.Random;
import javax.swing.JOptionPane;


public class Lista06att1 {

    public static void main(String[] args) {
        CartaoWeb [] cartoes = new CartaoWeb[3];
        cartoes[0] = new DiaDosNamorados();
        cartoes[1] = new Natal();
        cartoes[2] = new Aniversario();
        
        Random seleciona = new Random();
        CartaoWeb cartaoescolhido;
        
        for(int i = 0; i<3; i++){
            
            cartaoescolhido = cartoes[i];
            cartaoescolhido.retornarMensagem(JOptionPane.showInputDialog("Insira Remetente: "), JOptionPane.showInputDialog("Insira Destinatario: "));
        }
    }
    
}
