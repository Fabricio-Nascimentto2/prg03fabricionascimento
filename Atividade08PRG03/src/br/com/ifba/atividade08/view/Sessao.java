/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author fabricio
 */
public class Sessao {
    private Long id;
    private Usuario usuario;
    private String token;
    
    //  criação dos construtores 
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }
    
    public Sessao criarSessao() {
    String tokenGerado = "TOKEN-" + Math.random(); // Exemplo simples de token
    return new Sessao(1L, this, tokenGerado);
}
    
    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Sessao{" + "id=" + id + ", usuario=" + usuario + ", token=" + token + '}';
    }
    
    
    
}
