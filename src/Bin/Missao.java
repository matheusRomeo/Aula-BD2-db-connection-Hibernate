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
import javax.persistence.Table;

/**
 *
 * @author mathe
 */

@Entity
@Table(name = "Missao")
public class Missao implements Serializable{
    
    @Id
    @GeneratedValue
    @Column
    int idMissao;
    @Column
    String nomeMissao;
    @Column
    String materia;
    
    @ManyToOne
    @JoinColumn(name = "idConta")
    public Conta Conta;
    
    public Missao() {
    }

    public Missao(String nomeMissao, String materia, Conta Conta) {
        this.nomeMissao = nomeMissao;
        this.materia = materia;
        this.Conta = Conta;
    }

    public int getIdMissao() {
        return idMissao;
    }

    public void setIdMissao(int idMissao) {
        this.idMissao = idMissao;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Conta getConta() {
        return Conta;
    }

    public void setConta(Conta Conta) {
        this.Conta = Conta;
    }

    

   
        
}
