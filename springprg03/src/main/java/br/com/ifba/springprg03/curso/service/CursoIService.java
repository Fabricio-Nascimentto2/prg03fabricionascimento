/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java 
 */

package br.com.ifba.springprg03.curso.service; 

import br.com.ifba.springprg03.curso.entity.Curso;
import java.util.List;

/**
 * Interface de Serviço (Contrato de Negócios) para a entidade Curso.
 * Estabelece os métodos obrigatórios que a camada de negócio deve implementar,
 * garantindo o desacoplamento entre a camada de controle e a de persistência.
 * * @author fabricio
 */
public interface CursoIService {

    /**
     * Aplica as regras de validação necessárias e solicita a inserção de um novo curso.
     * * @param curso Objeto contendo os dados do curso a ser validado e salvo.
     * @return O objeto Curso persistido, agora contendo o ID gerado pelo banco.
     */
    Curso save(Curso curso);

    /**
     * Valida as modificações e solicita a atualização dos dados de um curso existente.
     * * @param curso Objeto com os dados atualizados do curso.
     * @return O objeto Curso atualizado no contexto do Hibernate.
     */
    Curso update(Curso curso);

    /**
     * Verifica as dependências de negócio (ex: se há turmas vinculadas) e solicita a exclusão.
     * * @param curso Objeto correspondente ao curso que deve ser removido.
     */
    void delete(Curso curso);

    /**
     * Recupera a coleção completa de todos os cursos registrados.
     * * @return List contendo todos os cursos cadastrados.
     */
    List<Curso> findAll();

    /**
     * Localiza um curso específico a partir do seu identificador único.
     * * @param id O identificador único do curso (ID).
     * @return O objeto Curso localizado, ou null caso não exista.
     */
    Curso findById(Long id);

    /**
     * Realiza uma busca textual filtrando os cursos pelo nome ou parte dele.
     * Essencial para alimentar os filtros e buscas dinâmicas das telas.
     * * @param name Termo ou trecho do nome utilizado como critério de busca.
     * @return List contendo os cursos que possuem o termo informado no nome.
     */
    List<Curso> findByName(String name);
}