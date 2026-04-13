/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tividade06.view;

/**
 *
 * @author fabricio
 */
public class ProjetoBanco {
    public static void main(String[] args) {
        // Criando a conta corrente
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(123);
        p1.setDono("Ueslei");
        p1.abrirConta("cc"); 
        
        // criando a peimeira conta poupança
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(248);
        p2.setDono("Fabricio Costa");
        p2.abrirConta("cp"); 
        
        // criando segunda conta poupança 
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(101);
        p3.setDono("Joao");
        p3.abrirConta("cp");
        
        // criando opções de movimentação entre as contas
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        p3.depositar(150);
        p3.sacar(180);
        p3.fecharConta();
        
        // cobrando mensalidade
        p1.pagarMensal();
        p2.pagarMensal();
        p3.pagarMensal();
        
        // Mostrado dados das contas 
        System.out.println("Saldo de " + p1.getDono() + ": " + p1.getSaldo());
        System.out.println("Saldo de " + p2.getDono() + ": " + p2.getSaldo());
        System.out.println("Saldo de " + p3.getDono() + ": " + p3.getSaldo());
    }

}
