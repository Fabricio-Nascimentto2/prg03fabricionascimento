/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java
 */

package br.com.ifba.springprg03.repository;

import br.com.ifba.springprg03.curso.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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
    
    // NENHUM MÉTODO PRECISA SER ESCRITO AQUI MANUALMENTE!
    // Através da herança de JpaRepository, o Spring Boot injeta em tempo de execução
    // métodos prontos como: save(), saveAll(), findById(), findAll(), delete(), entre outros.
    
}