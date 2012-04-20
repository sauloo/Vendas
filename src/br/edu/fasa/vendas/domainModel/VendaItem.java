/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.io.Serializable;
import javax.persistence.*;

/* VendaItem
 * @author Saulo Francisco
 * @version 0.3, 15 de abril 2012
 * @since 0.1  
 */
@Entity
@Table (name = "VendasItens")


public class VendaItem implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name="codigo")
    private int codigo;
    
    
    @ManyToOne(cascade= CascadeType.ALL,targetEntity=Venda.class)
    @JoinColumn(name="fk_venda",referencedColumnName="codigo")//db
    private Venda venda;
    
    @ManyToOne(cascade= CascadeType.ALL,targetEntity=Produto.class)
    @JoinColumn(name="produto")
    private Produto produto;
    
    @Column(name="quantidade")
    private int quantidade;
    
    @Column(name="valorunitario")
    private float valorunitario;
    
    
    public VendaItem(){
        
    }
    
    public VendaItem(int c, Venda v, Produto p, int q, float uv){
        
        codigo = c;
        venda = v;
        produto = p;
        quantidade = q;
        valorunitario = uv;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    
    
    
}
