/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Bin.Conta;

import Dao.DAOConta;
import Dao.DAOPessoa;

/**
 *
 * @author a160001x
 */
public class contaControl {
    
    private  DAOConta dao = new DAOConta();
    private DAOPessoa meta = new DAOPessoa();
            
    
      public int cadastrarConta(String email, String login, String senha, String pessoa) {
        
        int result = 0;
        
        
        
        try {
            
            Conta conta = new Conta();

            conta.setEmail(email);    
            conta.setLogin(login);
            conta.setSenha(senha);
            int id = Integer.parseInt(pessoa);
            
            //System.out.println(meta.getById(idPessoa)+" <<<tem que ter um dado aqui");
         
            dao.cadastrar(email, login, senha, meta.getById(id));
           

        
        } catch(Exception ex) {
            
            result = 1;
        
        }
        
        return result;
    }
    
}
