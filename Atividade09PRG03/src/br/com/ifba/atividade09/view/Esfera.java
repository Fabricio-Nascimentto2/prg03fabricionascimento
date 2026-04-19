/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;


/**
 *
 * @author fabricio
 */

public class Esfera extends FormaTridimensional{
    
    private double raio;
    
    @Override
    public double obterArea() {
       //calcula a area da esfera utilizanda a formula 4 * PI * Math.pow(raio, 2)
       return 4 * Math.PI * Math.pow(raio, 2);

    }

    @Override
    public double obterVolume() {
        //calcula o volume da esfera utilizanda a formula (4/3) * PI * Math.pow(raio, 3);
        return (4.0/ 3.0) * Math.PI * Math.pow(raio, 3);
    }
    
    //construtores
    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // retorna as informações da esfera
    @Override
    public String toString() {
        return "Esfera{" + "raio=" + raio + '}';
    }
    
    
}
