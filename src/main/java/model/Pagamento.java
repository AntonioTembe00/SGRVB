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
@Table(name = "tab_pagamento")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "reserva_id",nullable = false)
    private Reserva reserva;
    @ManyToOne
    @JoinColumn(name = "tipopagamento_id", nullable = false)
    private Tipopagamento tipopagamento;
    private String estadopagamento;
    private Integer estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Pagamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Tipopagamento getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(Tipopagamento tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

    public String getEstadopagamento() {
        return estadopagamento;
    }

    public void setEstadopagamento(String estadopagamento) {
        this.estadopagamento = estadopagamento;
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
        return "reserva=" + reserva + ", tipopagamento=" + tipopagamento;
    }

    
}
