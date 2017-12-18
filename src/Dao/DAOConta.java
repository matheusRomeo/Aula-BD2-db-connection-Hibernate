/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bin.Conta;
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
public class DAOConta extends DAO<Conta> {

    
    public void cadastrar(String email, String login, String senha, Pessoa pessoa) {
          
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Conta conta = new Conta();
        
        conta.setEmail(email);
        conta.setLogin(login);
        conta.setSenha(senha);
        conta.setPessoa(pessoa);
        
         Transaction tx =session.beginTransaction();
        
        session.saveOrUpdate(conta);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        sf.close();
        
        
    }

    public Conta getById(int idConta){
        Conta conta =null;
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        String query =("FROM Conta WHERE idConta = "+idConta);
        Query listagemQuery = session.createQuery(query);
        
        List<Conta> list = listagemQuery.list();
        int tamanhoList = list.size();
        for(int i=0; i<tamanhoList; i++){
            
            
            conta = list.get(i);
            
           
        }

        return conta;
    }
    
}
