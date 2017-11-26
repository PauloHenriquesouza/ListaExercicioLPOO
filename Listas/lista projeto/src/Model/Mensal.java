/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Mensal extends AluguelDeAutomovel{
    protected Pessoa pessoa;
    protected Automovel automovel;
    protected float valor_mensal;

    public Mensal() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public float getValor_mensal() {
        return valor_mensal;
    }

    public void setValor_mensal(float valor_mensal) {
        this.valor_mensal = valor_mensal;
    }
    
}
