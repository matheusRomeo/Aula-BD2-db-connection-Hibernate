/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bin.Conta;
import Bin.Fase;
import Bin.Personagem;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author mathe
 */
public class DAOPersonagem extends DAO<Personagem>{

    
    public void cadastrar(String nickName, Conta conta) {
       SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Personagem personagem =  new Personagem();
        
        personagem.setNickName(nickName);
        personagem.setConta(conta);
        
        
        Transaction tx =session.beginTransaction();
        
        session.saveOrUpdate(personagem);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        sf.close();
 
    }

  public Personagem getById(int idPersonagem){
        Personagem personagem =null;
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        String query =("FROM Personagem WHERE idPersonagem = "+idPersonagem);
        Query listagemQuery = session.createQuery(query);
        
        List<Personagem> list = listagemQuery.list();
        int tamanhoList = list.size();
        for(int i=0; i<tamanhoList; i++){
            
            
            personagem = list.get(i);
            
           
        }

        return personagem;
    }
    
}
