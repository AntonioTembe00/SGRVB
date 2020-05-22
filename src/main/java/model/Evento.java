/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author
 */
@Entity
@Table(name = "tab_evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "bilhete_id", nullable = false)
    private Jogo jogo;
    private Date datajogo;
    private String descricao;
    private Double valor;
    @Column(nullable =false)
    private Integer bilhetesDisponiveis;
    private Integer estado;
    private String estadoevento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Evento() {
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

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Date getDatajogo() {
        return datajogo;
    }

    public void setDatajogo(Date datajogo) {
        this.datajogo = datajogo;
    }

    public String getEstadoevento() {
        return estadoevento;
    }

    public void setEstadoevento(String estadoevento) {
        this.estadoevento = estadoevento;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getBilhetesDisponiveis() {
        return bilhetesDisponiveis;
    }

    public void setBilhetesDisponiveis(Integer bilhetesDisponiveis) {
        this.bilhetesDisponiveis = bilhetesDisponiveis;
    }

    
    @Override
    public String toString() {
        return  jogo.getNome();
    }
    
    

   
}
