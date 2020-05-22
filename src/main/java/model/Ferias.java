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
@Table(name = "tab_ferias")
public class Ferias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "funcionario_id",nullable = false)
    private Funcionario funcionario;
    private Integer estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;
    private Date dataFim;

    public Ferias() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

 

    @Override
    public String toString() {
        return "funcionario=" + funcionario.getNome() + ", data=" + dataFim;
    }

    

    
}
