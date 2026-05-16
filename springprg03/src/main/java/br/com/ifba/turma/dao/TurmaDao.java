/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.turma.dao;

import br.com.ifba.infrastructure.dao.GenericDao;
import br.com.ifba.springprg03.turma.entity.Turma;
import org.springframework.stereotype.Repository;

/**
 * Implementação do DAO para a entidade Turma integrada ao Spring Boot 3.
 * Herda as operações de CRUD do GenericDao gerenciado pelo Spring.
 * 
 * @author fabricio
 */
@Repository // Avisa ao Spring que esta classe gerencia a persistência de Turmas
public class TurmaDao extends GenericDao<Turma> implements TurmaIDao {

    /**
     * Construtor da classe TurmaDao.
     * Passa a classe Turma para o GenericDao estruturado no Jakarta Persistence.
     */ 
    public TurmaDao() {
        super(Turma.class);
    }
}
