/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04a1;

/**
 *
 * classe Cachorro que estende a classe Animal e tem os atributos nome e raça do cachorro
 */
public class Cachorro extends Animal{
    protected String nome;
    protected String raca;

    public Cachorro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "nome=" + nome + ", raca=" + raca + '}';
    }
    
}
