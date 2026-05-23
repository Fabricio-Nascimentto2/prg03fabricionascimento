/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */

package br.com.ifba.springprg03.curso.service;

import br.com.ifba.springprg03.curso.entity.Curso;
import br.com.ifba.springprg03.infrastructure.util.StringUtil;
import br.com.ifba.springprg03.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Implementação da Camada de Serviço (Regras de Negócio) para a entidade Curso.
 * Centraliza as validações e gerencia o comportamento das transações com o banco.
 * * @author fabricio
 */

@Service // Registra esta classe como um Bean de Serviço no contêiner IoC do Spring
@Transactional // Abre e gerencia automaticamente transações ACID do banco para todos os métodos de escrita
public class CursoService implements CursoIService {
    
    /**
     * Injeção do Repository do Spring Data. 
     * Note que não precisamos de uma classe "CursoDaoImpl" física; o Spring 
     * cria uma instância em memória que implementa CursoRepository.
     */
    @Autowired 
    private CursoRepository cursoRepository;
    
    /**
     * Aplica regras de validação e insere um novo curso no banco de dados.
     * * @param curso Objeto preenchido na interface gráfica.
     * @return O objeto Curso persistido com ID gerado.
     * @throws RuntimeException Se o objeto for nulo ou se o nome estiver em branco.
     */
    @Override
    public Curso save(Curso curso) {
        // Validação preventiva de consistência do objeto
        if (curso == null) {
            throw new RuntimeException("Objeto curso nulo!");
        }
        
        // Regra de Negócio: O nome do curso é um campo obrigatório
        if (StringUtil.isEmpty(curso.getNome())) {
            throw new RuntimeException("O nome do curso é obrigatório!");
        }
        
        /** 
         * PERSISTÊNCIA: O método save() do Spring Data JPA identifica se o objeto 
         * é novo (ID nulo) para dar um persist(), ou existente (ID preenchido) 
         * para dar um merge().
         */
        return cursoRepository.save(curso); 
    }

    /**
     * Valida e atualiza os dados de um curso existente.
     * * @param curso Objeto contendo as alterações e o ID correspondente.
     * @return O objeto Curso mesclado e atualizado pelo Hibernate.
     * @throws RuntimeException Se o objeto fornecido for nulo.
     */
    @Override
    public Curso update(Curso curso) {
        if (curso == null) {
            throw new RuntimeException("Objeto curso nulo!");
        }
        /**
         * ATUALIZAÇÃO: Assim como no save(), o Spring Data JPA gerencia o estado 
         * da entidade. Se o ID existir no banco, ele atualiza o registro com 
         * os novos valores.
         */
        return cursoRepository.save(curso);
    }

    /**
     * Remove um curso do sistema de forma segura dentro de uma transação.
     * * @param curso Objeto correspondente ao curso que será deletado.
     * @throws RuntimeException Se o objeto fornecido for nulo.
     */
    @Override
    public void delete(Curso curso) {
        if (curso == null) {
            throw new RuntimeException("Objeto curso nulo!");
        }
        /**
         * REMOÇÃO: O repository cuida de garantir que a entidade esteja anexada 
         * (managed) antes de tentar removê-la do banco de dados.
         */
        cursoRepository.delete(curso);
    }

    /**
     * Recupera todos os cursos gravados no banco de dados.
     * * @return List contendo a listagem completa de cursos.
     */
    @Override
    public List<Curso> findAll() {
        /**
         * SELECT ALL: Retorna todos os registros da tabela curso mapeada pela entidade.
         */
        return cursoRepository.findAll();
    }

    /**
     * Localiza um curso específico por meio do seu ID único.
     * * @param id Chave primária do curso.
     * @return O objeto Curso encontrado ou null se não existir.
     */
    @Override
    public Curso findById(Long id) {
        /**
         * BUSCA POR ID: O Spring Data retorna um Optional<T>. 
         * O uso de .orElse(null) é uma forma segura de lidar com IDs inexistentes, 
         * mas você também poderia usar .orElseThrow(() -> new RuntimeException("Não encontrado")).
         */
        return cursoRepository.findById(id).orElse(null);
    }

    /**
     * Executa a busca dinâmica filtrando os registros pelo nome do curso.
     * * @param name Filtro textual (parcial ou completo) fornecido na View.
     * @return List contendo os cursos filtrados.
     */
    @Override
    public List<Curso> findByName(String name) {
        /**
         * BUSCA CUSTOMIZADA: Utiliza o método definido na interface Repository 
         * que gera a consulta baseada no padrão Containing (LIKE %) e IgnoreCase.
         */
        return cursoRepository.findByNomeContainingIgnoreCase(name);
    }
}