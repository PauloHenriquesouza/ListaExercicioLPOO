/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05;

public class Computador extends Eletronico{
    protected String Marca;
   

    public Computador() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Computador{" + "Marca=" + Marca + '}';
    }
    
    
}
