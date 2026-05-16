/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java
 */

package br.com.ifba.springprg03.repository;

import br.com.ifba.infrastructure.dao.GenericDao;
import br.com.ifba.springprg03.curso.entity.Curso;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Implementação específica do DAO para a entidade Curso integrada ao Spring Boot 3.
 * Estende GenericDao para utilizar a infraestrutura de persistência gerenciada pelo Spring.
 * 
 * @author fabricio
 */
@Repository // Avisa ao Spring que esta classe gerencia o acesso ao banco de dados
public class CursoDao extends GenericDao<Curso> implements CursoIDao {
   
    // Construtor da classe que passa a classe Curso para o GenericDao
    public CursoDao() {
        super(Curso.class);
    }
    
    // Realiza a busca de cursos pelo nome utilizando JPQL
    @Override
    public List<Curso> findByName(String name) {
        String jpql = "select c from Curso c where lower(c.nome) like :name";
        return entityManager.createQuery(jpql, Curso.class)
                            .setParameter("name", "%" + name.toLowerCase() + "%")
                            .getResultList();
    }

    @Override
    public List<Curso> buscarPorNome(String termo) {
        return this.findByName(termo);
    }
    
    // Remove um curso do banco de dados
    @Override
    public void remover(Curso selecionado) {
        // Chamando o delete mapeado no GenericDao gerenciado pelo Spring
        this.delete(selecionado);
    }
}