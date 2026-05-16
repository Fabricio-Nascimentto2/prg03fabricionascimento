/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.springprg03.turma.entity; // PACOTE ATUALIZADO

import br.com.ifba.springprg03.infrastructure.entity.PersistenceEntity; // Import atualizado
import jakarta.persistence.Entity; // MUDADO DE JAVAX PARA JAKARTA
import java.io.Serializable;

/**
 * Entidade que representa uma Turma no sistema integrada ao Spring Boot 3.
 * Herda o ID padronizado da classe base PersistenceEntity.
 *
 * @author fabricio
 */
@Entity
public class Turma extends PersistenceEntity implements Serializable {

    private String nome;
    private String codigo;

    // Construtor vazio (obrigatório para o Hibernate/JPA ler os dados do banco)
    public Turma() {
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
