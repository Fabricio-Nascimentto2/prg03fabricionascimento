/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tividade06.view;

/**
 *
 * @author fabricio
 */
public class ContaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // metodo dos construtores
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // metodos que define o status da conta 
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
        } else if (t.equals("cp")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    // Metedo ele verifica se a conta esta está com valor seja positivo ou negativo caso ele não pode feixa a conta 
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Erro: Conta com dinheiro. Saque antes de fechar.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Erro: Conta em débito. Regularize o saldo.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    //verifica se a conta existe se sim esta disponuvel pra depositos 
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito de R$" + v + " realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    // Metedo para retiranda de dinheiro ele verivica se a valor disponivel na conta se sim ele saca se não informa que o saldo na conta está insuficiente 
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de R$" + v + " realizado por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    // metedo que desconta os valores das contas poupaça e corrente 
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo().equals("cc")) {
            v = 12;
        } else if (this.getTipo().equals("cp")) {
            v = 20;
        }

        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade de R$" + v + " paga por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para pagar mensalidade.");
            }
        } else {
            System.out.println("Impossível cobrar mensalidade de conta fechada.");
        }
    }

    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
