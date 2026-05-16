/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java
 */

package br.com.ifba.springprg03.curso.controller;

import br.com.ifba.springprg03.curso.entity.Curso;
import java.util.List;

/**
 * Interface de contrato para a camada de controle da entidade Curso.
 * 
 * @author fabricio
 */
public interface CursoIController {
    Curso save(Curso curso) throws RuntimeException;
    void update(Curso curso) throws RuntimeException;
    void delete(Curso curso) throws RuntimeException;
    List<Curso> findAll() throws RuntimeException;
    Curso findById(Long id) throws RuntimeException;
    List<Curso> findByName(String nome) throws RuntimeException;
}
