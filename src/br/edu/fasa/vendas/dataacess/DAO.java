/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.dataacess;

import br.edu.fasa.vendas.domainModel.Repositorio;
import com.sun.corba.se.spi.activation.Repository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Saulo Francisco
 * @version 0.1
 *
 */
public class DAO<T> implements Repositorio<T>{

    private EntityManager manager;
    private Class classe;
    public DAO(Class t){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("VendasPU");
        manager = factory.createEntityManager();
        classe = t;
    }




    @Override
    public void salvar(T obj) {

        EntityTransaction tran = manager.getTransaction();
        try{
            tran.begin();
            manager.persist(obj);
            tran.commit();
        }
        catch(Exception e){
            tran.rollback();
        }
    }

    @Override
    public T abrir(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void apagar(T obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
