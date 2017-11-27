
package lista05;

import javax.swing.JOptionPane;


public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Net c2 = new Net();
        c2.setCor(JOptionPane.showInputDialog("Insira a cor do Eletronico: "));
        c2.setMarca(JOptionPane.showInputDialog("Qual a Marca do Computador"));
        JOptionPane.showMessageDialog(null, c2.Status());
        c2.Teminternet();
        
        Ligação c1 = new Ligação();
        c1.setCor(JOptionPane.showInputDialog("Insira a cor do Eletronico: "));
        c1.setOperadora(JOptionPane.showInputDialog("Qual a Operadora do Telefone"));
        JOptionPane.showMessageDialog(null, c1.Status());
        c1.TemCredito();
        
    } 
}