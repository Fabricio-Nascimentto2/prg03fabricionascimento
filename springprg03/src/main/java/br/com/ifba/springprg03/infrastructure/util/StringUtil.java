/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java
 */

package br.com.ifba.springprg03.infrastructure.util;

/**
 * Classe utilitária para manipulação e validação de Strings no ecossistema Spring Boot.
 * 
 * @author fabricio
 */
public class StringUtil {
    
    /**
     * Verifica se uma String é nula ou se está vazia (apenas espaços).
     * @param str A string a ser validada.
     * @return true se estiver vazia ou nula, false caso contrário.
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    
}