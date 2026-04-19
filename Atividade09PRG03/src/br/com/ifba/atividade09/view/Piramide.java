/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public class Piramide extends FormaTridimensional{
    
    private double lado;
    private double altura;

    // Construtor da classe Piramide.
    public Piramide(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    //obtem o valor do lado da base
    public double getLado() {
        return lado;
    }

    //define o valor do lado da base
    public void setLado(double lado) {
        this.lado = lado;
    }

    //obtem a altura da piramide
    public double getAltura() {
        return altura;
    }

    //define a altura da piramide
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double obterArea() {
        double areaBase = lado * lado;
        // A raiz quadrada deve envolver a soma dos dois quadrados
        double apotema = Math.sqrt(Math.pow(lado / 2.0, 2) + Math.pow(altura, 2));
        double lateral = 2 * lado * apotema;
        
        // Retorna a soma da área da base com a área lateral
        return areaBase + lateral;
    }

    //define a altura da piramende
    @Override
    public double obterVolume() {
        return (1.0/ 3.0) * (lado * lado) * altura;
    }
    
    //Retorna uma representação textual dos dados da Pirâmide.
    @Override
    public String toString() {
        return "Piramide{" + "lado=" + lado + ", altura=" + altura + '}';
    }
    
    
}
