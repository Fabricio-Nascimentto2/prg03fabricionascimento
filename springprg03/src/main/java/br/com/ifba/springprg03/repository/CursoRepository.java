/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java
 */

package br.com.ifba.springprg03.repository;

import br.com.ifba.springprg03.curso.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Interface de Persistência (Repository) nativa do Spring Data JPA para a entidade Curso.
 * * Fornece, de forma totalmente automatizada via herança de JpaRepository, 
 * todas as operações padrão de CRUD (salvar, atualizar, deletar, buscar) e paginação,
 * eliminando a necessidade de escrever queries SQL ou JPQL manuais.
 * * Mapeamento de Tipos:
 * - Curso: A entidade JPA que representa a tabela no banco.
 * - Long: O tipo de dado da chave primária (@Id) da entidade.
 * * @author fabricio
 */
@Repository // Registra a interface como um componente de persistência no ecossistema IoC do Spring
public interface CursoRepository extends JpaRepository<Curso, Long> {
    
    /**
     * Busca cursos que contenham o nome informado, ignorando maiúsculas e minúsculas.
     * QUERY METHOD: O Spring Data JPA interpreta o nome deste método e gera 
     * automaticamente o JPQL correspondente: "SELECT c FROM Curso c WHERE LOWER(c.nome) LIKE LOWER(CONCAT('%', :nome, '%'))"
     * @param nome Parte do nome do curso.
     * @return Lista de cursos encontrados.
     */
    List<Curso> findByNomeContainingIgnoreCase(String nome);
}