/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fabricio
 */
public class Main {
    public static void main(String[] args) {
        // criando os perfis e suas permissoẽs 
        PerfilUsuario perfilAdmin = new PerfilUsuario();
        perfilAdmin.setId(1L);
        perfilAdmin.setDescricao("Administrador do Sistema");
        perfilAdmin.setPermissoes(new ArrayList<>(Arrays.asList("LEITURA", "ESCRITA", "DELETE")));

        // criando o usuário 
        Usuario user = new Usuario(
            1L, 
            perfilAdmin, 
            "fabricio", 
            "fabricio@ifba.edu.br", 
            "senha123", 
            LocalDateTime.now(), 
            true
        );

        // cria o log de auditoria
        LogAuditoria log = new LogAuditoria(10L, user, "login_efetuado_com_sucesso!", LocalDateTime.now(), "192.168.0.1");

        // Criando uma sesão de login 
        Sessao sessao = new Sessao(100L, user, "TOKEN-IFBA-2026-XYZ");

        // imprimindo os resultaods do login do usuario
        System.out.println("--- Dados do usuario ---");
        System.out.println(user);
        
        System.out.println("\n--- Dados do log ---");
        System.out.println(log);
        
        System.out.println("\n--- Dados da sessão ---");
        System.out.println(sessao);
    }
    
}
