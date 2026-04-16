/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author fabricio
 */
public class PagamentoPix implements Pagamento {
    //calcula o valor do pagamento por pix e retorna o valor do cashback
    public double calcularTotal(double valor){
        return valor * 0.98; 
    }

    @Override
    // impeimi o recibo com os valores da original e com desconto
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
        System.out.println("--- RECIBO PIX ---");
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Cashback (2%): R$ " + (valorOriginal - valorFinal));
        System.out.println("Valor Final: R$ " + valorFinal);
    }

    @Override
    public double calculaTotal(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
