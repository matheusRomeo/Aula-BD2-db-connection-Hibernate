/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;





/**
 *
 * @author mathe
 * DATA ACCESS OBJECT
 * 
 */
public abstract class DAO<Generics>  {

    //protected static final EntityManager entityManager =
      //      Persistence.createEntityManagerFactory("hibernate-example").createEntityManager();

   /* BUSCAR POR iD RETIRADO DO CONTA para implementar com generic posteriormente
    public Generics getById(int id){
        Generics conta =null;
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        String query =("FROM Conta WHERE idConta = "+id);
        Query listagemQuery = session.createQuery(query);
        
        List<Conta> list = listagemQuery.list();
        int tamanhoList = list.size();
        for(int i=0; i<tamanhoList; i++){
            
            
            conta = list.get(i);
            
           
        }

        return conta;
    }
    
*/
}