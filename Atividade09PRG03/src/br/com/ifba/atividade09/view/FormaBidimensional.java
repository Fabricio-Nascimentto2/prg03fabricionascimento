/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public abstract class FormaBidimensional extends Forma{
    /**
     * Método abstrato que deve ser implementado por todas as formas bidimensionais.
     * Cada subclasse (filha) deve fornecer sua própria fórmula matemática para
     * calcular a área da superfície plana.
     * * @return O valor da área da forma bidimensional.
     */
    public abstract double obterArea();
    
}
