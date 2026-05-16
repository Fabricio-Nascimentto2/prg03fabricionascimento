/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package br.com.ifba.springprg03.curso.entity;

// imports 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
/**
 *
 * @author fabricio
 */
@Entity
public class Curso implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer vagas;
    
    private String nome;
    private String codigo;
    private String modalidade;

    // Construtor vazio (obrigatório para o Hibernate)
    public Curso() {
    }

    // Métodos Getters e Setters (Use Alt+Insert no NetBeans)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public String getModalidade() { return modalidade; }
    
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
}
