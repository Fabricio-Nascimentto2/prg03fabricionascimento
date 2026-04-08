/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.view;

/**
 *
 * @author fabricio
 */
public class Fatorial {
    // atributos
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        
    // laço de repetição
        for (int i = n; i > 1; i--) {
            f *= i;
            s += i + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    //retorna o valor calculado
    public int getFatorial() {
        return fat;
    }
    
    //retorna a formula do calculo
    public String getFormula() {
        return formula;
    }
    
}
