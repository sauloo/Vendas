/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.io.Serializable;
import javax.persistence.*;

/* Cliente
 * @author Saulo Francisco
 * @version 0.3, 15 de abril 2012
 * @since 0.1  
 */
@Entity
@Table(name= "clientes")

public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;
    
    @Column(name="nome", length=255)
    private String nome;
    
    
    public Cliente (){ //Construtor da classe.
        
    } 
    
    public Cliente(int c, String n){//construtor com parametos
        
        codigo = c;
        nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
