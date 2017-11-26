/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05;

public class Telefone extends Eletronico{
    protected String Operadora;
   

    public Telefone() {
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String Operadora) {
        this.Operadora = Operadora;
    }

    @Override
    public String toString() {
        return "Telefone{" + "Operadora=" + Operadora + '}';
    }
    
    
}