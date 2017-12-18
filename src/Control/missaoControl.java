/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Bin.Missao;
import Dao.DAOConta;
import Dao.DAOMissao;

/**
 *
 * @author a160001x
 */
public class missaoControl {
    
    private  DAOMissao dao = new DAOMissao();
    private DAOConta meta = new DAOConta();
            
    
      public int cadastrarMissao(String nomeMissao, String materia, String conta) {
        
        int result = 0;
        
        
        
       try {
       
            Missao missao = new Missao();
            
            missao.setNomeMissao(nomeMissao);
            missao.setMateria(materia);
            int id = Integer.parseInt(conta);
         
            dao.cadastrar(nomeMissao, materia, meta.getById(id));
           

        
        
        } catch(Exception ex) {
            
            result = 1;
        
        }
        
        return result;
    }
    
}
