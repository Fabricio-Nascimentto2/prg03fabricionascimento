/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author fabricio
 */
public abstract class Forma {

    //retorna o texto da forma
    //Utiliza reflexão (Reflection) para identificar automaticamente o nome da classe filha que está sendo instanciada.@Override
    public String toString() {
        return "Objeto do tipo" + this.getClass().getSimpleName();
    }
    
    
}
