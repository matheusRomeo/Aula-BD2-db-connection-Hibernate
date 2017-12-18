/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bin;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author mathe
 */

@Entity
@Table(name = "Personagem")
public class Personagem implements Serializable{
    
    
    @Id
    @GeneratedValue
    private int idPersonagem;
    @Column
    String nickName;
    @Column
    String rank;
    
    @ManyToOne
    @JoinColumn(name = "idConta")
    public Conta conta;

    public Personagem() {
    }

    public Personagem(String nickName, Conta conta) {
        this.nickName = nickName;
        this.conta = conta;
    }
    
    

    public int getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    
   
}
