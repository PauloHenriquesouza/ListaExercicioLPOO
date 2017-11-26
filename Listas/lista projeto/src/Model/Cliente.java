/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Cliente extends Pessoa{
    protected String IDCliente;
    protected String rg;

    public Cliente() {
    }

    public String getId_cliente() {
        return IDCliente;
    }

    public void setId_cliente(String id_cliente) {
        this.IDCliente = id_cliente;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
