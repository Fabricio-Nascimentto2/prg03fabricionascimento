/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java
 */

package br.com.ifba.infrastructure.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementação genérica e abstrata do padrão DAO (Data Access Object).
 * Centraliza as operações básicas de CRUD utilizando a API do Jakarta Persistence (JPA).
 * * @param <Entity> O tipo da entidade que será manipulada pelo DAO.
 * @author fabricio
 */
public abstract class GenericDao<Entity> implements GenericIDao<Entity> {

    @PersistenceContext // Injeta automaticamente o EntityManager gerenciado pelo Spring de acordo com o contexto da transação
    protected EntityManager entityManager;

    private final Class<Entity> persistentClass;

    /**
     * Construtor que captura a classe real da entidade em tempo de execução.
     * Necessário para que o EntityManager saiba com qual tabela/classe trabalhar nos métodos genéricos.
     * * @param persistentClass Classe da entidade (ex: Curso.class, Turma.class)
     */
    public GenericDao(Class<Entity> persistentClass) {
        this.persistentClass = persistentClass;
    }

    /**
     * Insere uma nova entidade no banco de dados.
     * Torna o objeto "gerenciado" (managed) pelo contexto de persistência.
     * * @param entity Objeto contendo os dados a serem salvos.
     * @return A entidade salva.
     */
    @Override
    public Entity save(Entity entity) {
        entityManager.persist(entity);
        return entity;
    }

    /**
     * Atualiza os dados de uma entidade já existente no banco de dados.
     * Pega uma instância desanexada (detached) e mescla seu estado atual com o banco.
     * * @param entity Objeto com os dados modificados.
     * @return A instância gerenciada e atualizada pelo Hibernate.
     */
    @Override
    public Entity update(Entity entity) {
        return entityManager.merge(entity);
    }

    /**
     * Remove um registro do banco de dados.
     * Faz uma checagem preventiva: se o objeto não estiver no estado "gerenciado" (managed)
     * pela Thread atual, ele faz um merge antes para garantir que o Hibernate consiga deletar sem erros.
     * * @param entity Objeto a ser removido.
     */
    @Override
    public void delete(Entity entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    /**
     * Busca todos os registros da entidade correspondente no banco de dados.
     * Utiliza JPQL dinâmica baseada no nome simples da classe capturada no construtor.
     * * @return List contendo todas as entidades encontradas.
     */
    @Override
    public List<Entity> findAll() {
        String jpql = "from " + persistentClass.getSimpleName();
        return entityManager.createQuery(jpql, persistentClass).getResultList();
    }

    /**
     * Localiza um registro específico no banco de dados através da sua chave primária (ID).
     * * @param id O identificador único do registro.
     * @return A entidade correspondente ou null se não for encontrada.
     */
    @Override
    public Entity findById(Long id) {
        return entityManager.find(persistentClass, id);
    }
}