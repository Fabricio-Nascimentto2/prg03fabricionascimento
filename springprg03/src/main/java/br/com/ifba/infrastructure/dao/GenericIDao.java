/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */

package br.com.ifba.infrastructure.dao;

import java.util.List;

/**
 * Interface genérica para o padrão de projeto DAO (Data Access Object).
 * Define as operações essenciais de persistência para qualquer entidade do sistema.
 * 
 * @author fabricio
 */
public interface GenericIDao<Entity> {
    
    /**
     * Salva uma nova entidade no banco de dados.
     * @param entity Objeto a ser persistido.
     * @return A entidade persistida.
     */
    Entity save(Entity entity);
    
    /**
     * Atualiza os dados de uma entidade já existente.
     * @param entity Objeto com os novos dados.
     * @return A entidade atualizada.
     */
    Entity update(Entity entity);
    
    /**
     * Remove uma entidade do banco de dados.
     * @param entity Objeto a ser removido.
     */
    void delete(Entity entity);
    
    /**
     * Recupera todos os registros da entidade cadastrados no banco.
     * @return Lista contendo todas as instâncias encontradas.
     */
    List<Entity> findAll();
    
    /**
     * Busca uma entidade específica através do seu identificador único.
     * @param id Chave primária do registro.
     * @return A entidade encontrada ou null caso não exista.
     */
    Entity findById(Long id);
}