/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05;

public class Eletronico {
    protected String Formato;
    protected String cor;

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Eletronico() {
    }

    @Override
    public String toString() {
        return "Eletronico{" + "Formato=" + Formato + ", cor=" + cor + '}';
    }
    
    
}
