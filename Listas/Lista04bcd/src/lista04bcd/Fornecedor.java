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
public class Fornecedor extends Pessoa {
    
   String result, msg; double CreditoMaximo, ValorEmDivida,valorDivida,divida;
    
    public double GetCreditoMaximo (){
    return CreditoMaximo;
    }
    
    public void setCreditoMaximo (double CreditoMaximo) {
    this.CreditoMaximo = CreditoMaximo;
    }
    
    public double getValorEmDivida (){
    return ValorEmDivida; 
    }
    public void setValorEmDivida (double ValorEmDivida){
    this.ValorEmDivida = ValorEmDivida;
    }
    
    void valorDivida() {
result = JOptionPane.showInputDialog
        (null,"Digite o Credito Maximo:",  "Entrada de dados",JOptionPane.QUESTION_MESSAGE); 
CreditoMaximo = Integer.parseInt(result);

result = JOptionPane.showInputDialog
        (null,"Digite o valor de sua divida:",  "Entrada de dados", JOptionPane.QUESTION_MESSAGE); 
ValorEmDivida = Integer.parseInt(result); 

divida =CreditoMaximo-ValorEmDivida;

msg = String.format("Sua Divida é:\' %.1f\n",divida);  
JOptionPane.showMessageDialog(null,msg);
    }
    }
   
