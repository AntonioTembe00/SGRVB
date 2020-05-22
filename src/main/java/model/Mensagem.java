/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tem
 */
@Entity
@Table (name="tb_messagem")
public class Mensagem implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    private Integer id;
    @Column (length=500, nullable = false) 
    private String descricao; 
    @ManyToOne
    @JoinColumn ( name = "emissor", nullable = false) private Funcionario emissor;  
    @ManyToOne
    @JoinColumn ( name = "receptor", nullable = false) private Funcionario receptor; 
    @Column (length=500, nullable = false) 
    private String assunto;
    private Integer estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Mensagem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getEmissor() {
        return emissor;
    }

    public void setEmissor(Funcionario emissor) {
        this.emissor = emissor;
    }

    public Funcionario getReceptor() {
        return receptor;
    }

    public void setReceptor(Funcionario receptor) {
        this.receptor = receptor;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    
    @Override
    public String toString() {
        return descricao;
    }
    
    
    
}
