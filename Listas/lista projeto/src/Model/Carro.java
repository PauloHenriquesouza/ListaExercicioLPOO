/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Carro extends Automovel{
    protected int Capacidade;
    protected int Potencia;

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.Capacidade = capacidade;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int potencia) {
        this.Potencia = potencia;
    }

    public Carro() {
    }
    
}
