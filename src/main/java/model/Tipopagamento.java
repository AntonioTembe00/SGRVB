/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author 
 */
@Entity
@Table (name="tab_tipopagamento")
public class Tipopagamento implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    @Column(name="id") private Integer id;
    @Column (name="nome", length=60, nullable = false) private String nome; 
    @Column (name="descricao", length=60)  private String descricao;
    @Column(name="estado" ) private Integer estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Tipopagamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return nome;
    }

       
    
}
