/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04bcd;

import javax.swing.JOptionPane;


public class EmpregadoTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Empregado e1 = new Empregado();
        Fornecedor fr = new Fornecedor();
        Adiministrador ad = new Adiministrador();
        p1.setNome(JOptionPane.showInputDialog("Nome: "));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Altura: ")));
        p1.setSexo(JOptionPane.showInputDialog("Sexo: "));
        JOptionPane.showMessageDialog(null, p1.toString());
        e1.setSalario(1257f);
        JOptionPane.showMessageDialog(null, "O Salário do empregado é de: R$ " + e1.obterLucros());
        fr.valorDivida();
        ad.AjudasDeCusto();
        ad.setSalario(1257f);
        JOptionPane.showMessageDialog(null, "O Salário do Adiministrador é de: R$ " + ad.SalarioADM());
        
    }
}
