/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04b2;

import javax.swing.JOptionPane;


public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Empregado e1 = new Empregado();
        p1.setNome(JOptionPane.showInputDialog("Nome: "));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
        p1.setSexo(JOptionPane.showInputDialog("Sexo: "));
        JOptionPane.showMessageDialog(null, p1.toString());
        e1.setSalario(1.257f);
        JOptionPane.showMessageDialog(null, "O Salário do empregado é de: R$ " + e1.obterLucros());        
        
    }
    
}
