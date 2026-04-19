/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public class Cubo extends FormaTridimensional{
    
    private double lado;

    //construtores
    public Cubo(double lado) {
        this.lado = lado;
    }

    // getters e setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        //area 
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double obterVolume() {
        // retorne o cálculo, sem salvar em variável
        return Math.pow(lado, 3);
    }
    
    // retorna as informações da cubo
    @Override
    public String toString() {
        return "cubo{" + "lado = " + "area =" + obterArea()+"volume=" + obterVolume()+'}';
    }
    
}
