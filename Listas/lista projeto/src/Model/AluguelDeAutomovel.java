/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public abstract class AluguelDeAutomovel {
    protected String Data;
    protected String localizacao;

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        this.Data = data;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public AluguelDeAutomovel() {
    }   
}
