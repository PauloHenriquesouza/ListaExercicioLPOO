/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Automovel {
    protected String Modelo;
    protected String Marca;
    protected String Placa;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public Automovel() {
    }
}
