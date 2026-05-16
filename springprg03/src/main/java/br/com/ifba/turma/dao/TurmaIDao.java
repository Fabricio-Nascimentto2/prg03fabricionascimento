/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java
 */

package br.com.ifba.turma.dao;

import br.com.ifba.infrastructure.dao.GenericIDao;
import br.com.ifba.springprg03.turma.entity.Turma;

/**
 * Interface de contrato para as operações de persistência da entidade Turma.
 * Estende GenericIDao para herdar as operações básicas de CRUD de forma padronizada.
 * 
 * @author fabricio
 */
public interface TurmaIDao extends GenericIDao<Turma> {
    
    // Contrato limpo e herdado! Se futuramente precisar de buscas específicas de Turma,
    // as novas assinaturas de métodos entrarão aqui.
}