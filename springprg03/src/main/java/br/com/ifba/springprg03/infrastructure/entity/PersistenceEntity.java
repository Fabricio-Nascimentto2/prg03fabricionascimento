/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java
 */

package br.com.ifba.springprg03.infrastructure.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * Classe utilitária e superclasse abstrata de persistência.
 * Fornece a estrutura de identificação única (ID) para todas as entidades 
 * do ecossistema do projeto, evitando repetição de código.
 * * A interface Serializable garante que os objetos desta classe possam ser 
 * convertidos em bytes (útil para sessões, cache e tráfego de dados).
 * * @author fabricio
 */

@MappedSuperclass // Indica que esta classe não mapeia uma tabela própria, mas seus campos serão herdados pelas tabelas filhas
@Getter // Gera automaticamente os métodos Getter para todos os campos da classe em tempo de compilação
@Setter // Gera automaticamente os métodos Setter para todos os campos da classe em tempo de compilação
public class PersistenceEntity implements Serializable {

    @Id // Define o atributo abaixo como a chave primária (Primary Key) da tabela no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração do ID como autoincremento (gerado pelo próprio PostgreSQL)
    private Long id;
}