/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.springprg03.turma.entity; // PACOTE ATUALIZADO

import br.com.ifba.springprg03.infrastructure.entity.PersistenceEntity; // Import atualizado
import jakarta.persistence.Entity; // MUDADO DE JAVAX PARA JAKARTA
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Entidade que representa uma Turma no sistema integrada ao Spring Boot 3.
 * Herda o ID padronizado da classe base PersistenceEntity.
 *
 * @author fabricio
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Turma extends PersistenceEntity implements Serializable {

    private String nome;
    private String codigo;
}
