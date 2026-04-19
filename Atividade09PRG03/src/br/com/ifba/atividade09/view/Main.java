/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public class Main {
    public static void main(String[] args){
        Forma[] formas = new Forma[6];

        // objetos das classes filhas
        formas[0] = new Circulo(5.0);
        formas[1] = new Quandrado(10.0);
        formas[2] = new Triangulo(4.0, 5.0);
        formas[3] = new Esfera(3.0);
        formas[4] = new Cubo(2.0);
        formas[5] = new Piramide(3.0, 4.0);

        // for each para percorrer o array imprimido as informações dos objetos
        for (Forma f : formas) {
            System.out.println("-----------------------------");
            // Chama o toString
            System.out.println(f.toString()); 

            //informando o tipo 2D ou 3D usando 
            if(f instanceof FormaBidimensional) {
                FormaBidimensional f2d = (FormaBidimensional) f;
                System.out.println("Tipo: Forma Bidimensional");
                System.out.println("Area: " + f2d.obterArea());
            } 
            else if(f instanceof FormaTridimensional){
                FormaTridimensional f3d = (FormaTridimensional) f;
                System.out.println("Tipo: Forma Tridimensional");
                System.out.println("area: " + f3d.obterArea());
                System.out.println("Volume: " + f3d.obterVolume());
            }
        }
    }
}
