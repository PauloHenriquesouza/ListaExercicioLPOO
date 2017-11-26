/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04a1;

/**
 *
 * Classe Animal contendo os atributos tipo e cor
 */
public class Animal {
    protected String tipo;
    protected String cor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", cor=" + cor + '}';
    }
    
    
}
