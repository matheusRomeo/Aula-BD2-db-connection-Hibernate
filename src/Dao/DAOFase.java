/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Bin.Fase;
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
public class DAOFase extends DAO<Fase>{

  
    public void cadastrar(Missao missao) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        Fase fase = new Fase();
        
        fase.setMissao(missao);
        
        
        
        Transaction tx =session.beginTransaction();
        
        session.saveOrUpdate(fase);
        
        tx.commit();
        
        session.flush();
        
        session.close();
        sf.close();
        
    }

    public Fase getById(int idFase){
        Fase fase =null;
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        String query =("FROM Fase WHERE idFase = "+idFase);
        Query listagemQuery = session.createQuery(query);
        
        List<Fase> list = listagemQuery.list();
        int tamanhoList = list.size();
        for(int i=0; i<tamanhoList; i++){
            
            
            fase = list.get(i);
            
           
        }

        return fase;
    }
    
}
