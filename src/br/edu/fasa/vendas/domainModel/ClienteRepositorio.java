/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.List;

/**
 *
 * @author Saulo Francisco
 * @version 0.1
 * 
 */
public interface ClienteRepositorio extends Repositorio<Cliente> {

   List<Cliente> getAniversariantesMes();
    
}
