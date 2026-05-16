/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */

package br.com.ifba.springprg03.curso.controller;

import br.com.ifba.springprg03.curso.entity.Curso;
import br.com.ifba.springprg03.curso.service.CursoIService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Camada de Controle (Controller) para a entidade Curso integrada ao Spring Boot.
 * Atua como um intermediário/Facade entre a Interface Gráfica (View) e a
 * Camada de Negócios (Service), isolando o fluxo de dados.
 * * @author fabricio
 */
@Controller // Mapeia a classe como um componente controlador gerenciado pelo contêiner do Spring
public class CursoController implements CursoIController {

    @Autowired // Injeta automaticamente a implementação do serviço de cursos (CursoService)
    private CursoIService cursoService;

    /**
     * Solicita o salvamento/cadastro de um novo curso.
     * * @param curso Objeto contendo os dados do curso a ser persistido.
     * @return O objeto Curso salvo com seu respectivo ID gerado.
     * @throws RuntimeException Caso ocorra alguma violação de regra de negócio.
     */
    @Override
    public Curso save(Curso curso) throws RuntimeException {
        return this.cursoService.save(curso);
    }

    /**
     * Solicita a atualização dos dados de um curso existente.
     * * @param curso Objeto contendo os dados modificados do curso.
     * @throws RuntimeException Caso os dados sejam inválidos ou o registro não exista.
     */
    @Override
    public void update(Curso curso) throws RuntimeException {
        this.cursoService.update(curso);
    }

    /**
     * Solicita a remoção de um curso do sistema.
     * * @param curso Objeto correspondente ao curso que será deletado.
     * @throws RuntimeException Caso haja impedimentos (como turmas vinculadas).
     */
    @Override
    public void delete(Curso curso) throws RuntimeException {
        this.cursoService.delete(curso);
    }

    /**
     * Recupera a listagem completa de todos os cursos cadastrados no banco de dados.
     * * @return List contendo todos os cursos.
     * @throws RuntimeException Caso ocorra falha de comunicação com o banco de dados.
     */
    @Override
    public List<Curso> findAll() throws RuntimeException {
        return this.cursoService.findAll();
    }

    /**
     * Busca um curso específico utilizando o seu identificador único (ID).
     * * @param id O identificador único do curso.
     * @return O objeto Curso correspondente ou null se não localizado.
     * @throws RuntimeException Caso ocorra erro na busca.
     */
    @Override
    public Curso findById(Long id) throws RuntimeException {
        return this.cursoService.findById(id);
    }

    /**
     * Realiza a busca filtrada de cursos cujo nome contenha o termo especificado.
     * Método utilizado em tempo real pela barra de pesquisa da listagem.
     * * @param nome O termo ou trecho do nome do curso para a pesquisa.
     * @return List contendo os cursos que atendem ao critério de busca.
     * @throws RuntimeException Caso ocorra erro na execução da consulta filtrada.
     */
    @Override
    public List<Curso> findByName(String nome) throws RuntimeException {
        return this.cursoService.findByName(nome);
    }
}