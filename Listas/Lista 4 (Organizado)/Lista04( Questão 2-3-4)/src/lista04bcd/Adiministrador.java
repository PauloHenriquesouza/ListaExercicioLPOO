/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04bcd;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class Adiministrador extends Empregado {
  String R,msg;  float AjudasDeCusto ,SalarioADM; 
    
    public double getAjudasDeCusto(){
    return AjudasDeCusto;
    }
 
public void setAjudasDeCusto (float AjudasDeCusto){
this.AjudasDeCusto = AjudasDeCusto;

}
        float AjudasDeCusto(){
        R = JOptionPane.showInputDialog
        (null,"Digite o valor do Ajudas De Custo:",  "Entrada de dados",JOptionPane.QUESTION_MESSAGE); 
AjudasDeCusto = Integer.parseInt(R);
      return salario;
        
      
 
        
        }           
    public float SalarioADM(){
    return salario + AjudasDeCusto;
}
        

}