/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bin;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author mathe
 */
@Entity
@Table(name = "Conta")
public class Conta implements Serializable{

    @Id
    @GeneratedValue
    @Column
    int idConta;
    @Column
    String email;
    @Column
    String login;
    @Column
    String senha;
    
    @ManyToOne
    @JoinColumn(name = "idPessoa")
    public Pessoa pessoa;

    public Conta() {
    }

    public Conta(String email, String login, String senha, Pessoa pessoa) {
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    


    

}
