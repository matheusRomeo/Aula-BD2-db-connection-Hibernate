/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dao.DAOPersonagem;
import Bin.Personagem;
import Dao.DAOConta;

/**
 *
 * @author a160001x
 */
public class personagemControl {
    
    private DAOPersonagem dao = new DAOPersonagem();
     private DAOConta meta = new DAOConta();
    
      public int cadastrarPersonagem(String nick, String conta) {
        
        int result = 0;
        
        try {
            
            Personagem personagem = new Personagem();
            
            personagem.setNickName(nick);
            int id = Integer.parseInt(conta);
            
            dao.cadastrar(nick, meta.getById(id));
        
        } catch(Exception ex) {
            
            result = 1;
        
        }
        
        return result;
    }
    
}
