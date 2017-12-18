/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bin.Conta;
import Bin.Missao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author mathe
 */
public class DAOMissao extends DAO<Missao>{

    
   public void cadastrar(String nomeMissao, String materia, Conta Conta) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Missao missao = new Missao();
        
        missao.setNomeMissao(nomeMissao);
        missao.setMateria(materia);
        missao.setConta(Conta);
        
        
        
        Transaction tx =session.beginTransaction();
        
        session.saveOrUpdate(missao);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        sf.close();
   }

   public Missao getById(int idMissao){
        Missao missao =null;
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        String query =("FROM Missao WHERE idMissao = "+idMissao);
        Query listagemQuery = session.createQuery(query);
        
        List<Missao> list = listagemQuery.list();
        int tamanhoList = list.size();
        for(int i=0; i<tamanhoList; i++){
            
            
            missao = list.get(i);
            
           
        }

        return missao;
    }
    
}
