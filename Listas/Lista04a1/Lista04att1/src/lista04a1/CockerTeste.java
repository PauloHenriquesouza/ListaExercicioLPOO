
package lista04a1;

import javax.swing.JOptionPane;


public class CockerTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocker c1 = new Cocker();
        c1.setCor(JOptionPane.showInputDialog("Insira a cor do cachorro: "));
        c1.setNome(JOptionPane.showInputDialog("Qual o nome do cão?"));
        c1.setRaca(JOptionPane.showInputDialog("Qual a raça do cachorro?"));
        c1.setTipo(JOptionPane.showInputDialog("Qual o tipo do animal?"));
        c1.precisaTosa();
        
    }
    
}
