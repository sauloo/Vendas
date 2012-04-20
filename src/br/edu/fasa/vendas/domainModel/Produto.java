/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.*;

/* Produto
 * @author Saulo Francisco
 * @version 0.3, 15 de abril 2012
 * @since 0.1  
 */
@Entity
@Table(name="produtos")

public class Produto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="codigo")
    private int codigo;
    
    @Column(name="nome",length=255,nullable=false)
    private String nome;
    
    @Column(name="valor")
    private float valor;
    
   
    @Column(name = "estoque",nullable=false)
    private int estoque;
    
    public Produto(){
        
    }
    
    public Produto(int c, String n, float v, int e){
        
        codigo = c;
        nome = n;
        valor = v;
        estoque = e;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
