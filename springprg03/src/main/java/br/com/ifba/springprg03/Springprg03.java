/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java 
 */

package br.com.ifba.springprg03;

import br.com.ifba.springprg03.curso.view.CursoListar;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Classe principal de inicialização do Spring Boot.
 *
 * @author fabricio
 */
@SpringBootApplication
public class Springprg03 {

    public static void main(String[] args) {
        // Inicializa o contexto do Spring Boot desativando o modo Headless (essencial para Swing)
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Springprg03.class)
                .headless(false)
                .run(args);

        // Abre a interface gráfica de forma segura utilizando a thread do AWT/Swing
        java.awt.EventQueue.invokeLater(() -> {
            try {
                System.out.println("=========================================");
                System.out.println("  INICIANDO INTERFACE GRÁFICA SWING...    ");
                System.out.println("=========================================");

                // Resgata o Bean da tela totalmente configurado pelo Spring
                CursoListar telaPrincipal = context.getBean(CursoListar.class);

                // Configura propriedades básicas da janela e exibe na tela
                telaPrincipal.inicializar(); // Chama o carregamento da tabela
                telaPrincipal.setLocationRelativeTo(null); // Centraliza no monitor
                telaPrincipal.setVisible(true); // Exibe a tela

            } catch (Exception e) {
                System.err.println("Erro ao inicializar a interface gráfica: " + e.getMessage());
                e.printStackTrace();
            }
        });
    }
}
