/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public abstract class FormaTridimensional extends Forma{
    /**
     * Método abstrato para calcular a área superficial total do objeto tridimensional.
     * Deve ser implementado pelas subclasses para retornar a soma das áreas de todas as faces.
     * * @return O valor da área superficial da forma 3D.
     */
    public abstract double obterArea();
    
    /**
     * Método abstrato que define a obrigatoriedade do cálculo de volume.
     * O volume representa o espaço ocupado pelo objeto tridimensional.
     * * @return O valor do volume da forma 3D.
     */
    public abstract double obterVolume();
    
}
