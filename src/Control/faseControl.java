/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Bin.Fase;

import Dao.DAOFase;
import Dao.DAOMissao;



/**
 *
 * @author a160001x
 */
public class faseControl {
    
    private  DAOFase dao = new DAOFase();
    private DAOMissao meta = new DAOMissao();
    
    public int cadastrarFase(String missao) {
        
        int result = 0;
        
        
        
        try {
       
            Fase fase = new Fase();
           
            int id = Integer.parseInt(missao);
         
            dao.cadastrar(meta.getById(id));
           

        
        } catch(Exception ex) {
            
            result = 1;
        
        }
        
        return result;
    }
    
}
