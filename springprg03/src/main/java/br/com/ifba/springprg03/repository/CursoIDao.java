/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java
 */

package br.com.ifba.springprg03.repository;

import br.com.ifba.springprg03.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import java.util.List;

/**
 * Interface de contrato para as operações de persistência da entidade Curso.
 * Estende a interface genérica GenericIDao para herdar as operações básicas de CRUD.
 * 
 * @author fabricio
 */
public interface CursoIDao extends GenericIDao<Curso> {    
    
    /**
     * Define a busca de cursos por nome.
     * @param name Nome ou parte do nome.
     * @return Lista de cursos.
     */    
    List<Curso> findByName(String name);

    /**
     * Remove um curso selecionado da base de dados.
     * @param selecionado O curso a ser removido.
     */
    void remover(Curso selecionado);

    /**
     * Assinatura para busca por nome em português, facilitando a chamada nas telas.
     * @param termo Termo de pesquisa.
     * @return Lista de cursos filtrados.
     */
    List<Curso> buscarPorNome(String termo);

    public Curso save(Curso curso);
}