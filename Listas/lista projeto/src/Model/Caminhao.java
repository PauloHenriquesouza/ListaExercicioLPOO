/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Caminhao extends Automovel{
    protected float capacidadeCarga;
    protected int num_eixos;

    public Caminhao() {
    }

    public float getCapacidade_carga() {
        return capacidadeCarga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidadeCarga = capacidade_carga;
    }

    public int getNum_eixos() {
        return num_eixos;
    }

    public void setNum_eixos(int num_eixos) {
        this.num_eixos = num_eixos;
    }
    
    
}
