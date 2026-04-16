/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author fabricio
 */
public class PagamentoDinheiro implements Pagamento {
    // calcula o valor a ser pago por dinheiro e retorna o valor do desconto de 10%
    public double calcularTotal(double valor){
        return valor * 0.90;
    }
    
    @Override
    //imprimir o resultado do calculo em um recibo com os valores original e com desconto
    public void imprimirRecibo(double valorOriginal, double valorFinal){
        System.out.println("--- RECIBO DINHEIRO --");
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("desconto (10%): R$ " + (valorOriginal - valorFinal));
        System.out.println("Total pago: R$ " + valorFinal);
    }

    @Override
    public double calculaTotal(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
