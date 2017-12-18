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
@Table(name = "Fase")
public class Fase implements Serializable{
    
    @Id
    @GeneratedValue
    @Column
    int idFase;
    @Column
    int nota;

    @ManyToOne
    @JoinColumn(name = "idMissao")
    public Missao missao;

    public Fase() {
    }

    public Fase(Missao missao) {
        this.missao = missao;
    }

    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }
    
    
    
}
