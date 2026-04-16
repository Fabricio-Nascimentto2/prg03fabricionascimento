/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author fabricio
 */
public interface Pagamento {
    double calculaTotal(double valor);
    void imprimirRecibo(double valorOriginal, double valorFinal);

    public double calcularTotal(double valorOriginal);
    
}
