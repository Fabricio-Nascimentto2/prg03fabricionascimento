/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public class Circulo extends FormaBidimensional{
    
    private double raio;
    
    // construtores para defini o raio quando for criado o objeto
    public Circulo(double raio){
        this.raio = raio;
    }
    
    
    @Override
    public double obterArea() {
        //formula da area do circulo
        return Math.PI * Math.pow(raio, 2);
    }
    
    // metedo toString para mostra o raio
    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
    
    
    
}
