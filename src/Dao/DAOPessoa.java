/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bin.Pessoa;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author mathe
 */
public class DAOPessoa extends DAO<Pessoa> {

    

    public void cadastrar(String RA, String nome) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        Pessoa pessoa = new Pessoa();

        pessoa.setRA(RA);
        pessoa.setNome(nome);

        Transaction tx = session.beginTransaction();

        session.saveOrUpdate(pessoa);

        tx.commit();

        session.flush();

        session.close();
        sf.close();

    }
    
    public Pessoa getById(int idPessoa){
        Pessoa pessoa =null;
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        String query =("FROM Pessoa WHERE idPessoa = "+idPessoa);
        Query listagemQuery = session.createQuery(query);
        
        List<Pessoa> list = listagemQuery.list();
        int tamanhoList = list.size();
        for(int i=0; i<tamanhoList; i++){
            
            
            pessoa = list.get(i);
            
           
        }

        return pessoa;
    }
 

}
