/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Bin.Pessoa;
import Dao.DAOPessoa;


/**
 *
 * @author a160001x
 */
public class pessoaControl {
    
    private  DAOPessoa dao = new DAOPessoa();
    
      public int cadastrarPessoa(String nome, String RA) {
        
        int result = 0;
        
        
        
        try {
            
            Pessoa pessoa = new Pessoa();
            
            pessoa.setRA(RA);
            pessoa.setNome(nome);

            dao.cadastrar(RA, nome);
           

        
        } catch(Exception ex) {
            
            result = 1;
        
        }
        
        return result;
    }
    

    
}
