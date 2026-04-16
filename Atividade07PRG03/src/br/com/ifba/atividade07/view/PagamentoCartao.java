/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author fabricio
 */
public class PagamentoCartao implements Pagamento {   
    // calcula o valor a ser pago por cartão e adiciona a taxa de 5%
    public double calcularTotal(double valor) {
        return valor * 1.05; // 5% de taxa
    }

    @Override
    //imprimir o recibo com o valor a ser pago por cartão
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
        System.out.println("--- RECIBO CARTÃO ---");
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Taxa (5%): R$ " + (valorFinal - valorOriginal));
        System.out.println("Total a pagar: R$ " + valorFinal);
    }

    @Override
    public double calculaTotal(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
