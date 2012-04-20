/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.crypto.Data;


/* Venda
 * @author Saulo Francisco
 * @version 0.3, 15 de abril 2012
 * @since 0.2  
 */
@Entity
@Table(name = "venda")

public class Venda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;
    
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="fk_cliente",nullable=false)
    private Cliente cliente;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_")
    private Date datas;
    
    
    
    @OneToMany(cascade= CascadeType.ALL,mappedBy= "venda",targetEntity=VendaItem.class)    
    private List<VendaItem> itens;
    
    public Venda(){               //Construtor da classe.
        
    }
    
    public Venda(int c, Cliente cl, Data d) {//construtor com parametos
        
        codigo = c;
        cliente = cl;
        datas = (Date) d;
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return datas;
    }

    public void setData(Date data) {
        this.datas = data;
    }

   
    public void addIten(VendaItem iv) {
        itens.add(iv);
    }

    /**
     * @return the itens
     */
    public List<VendaItem> getItens() {

        return itens;

    }

    public void removeItens(VendaItem iv) {
        itens.remove(iv);

    }

    public VendaItem getItemVenda(int a) {
        return itens.get(a);
    }
    
    
    
    
}
