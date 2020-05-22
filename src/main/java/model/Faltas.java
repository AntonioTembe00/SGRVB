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
@Table(name = "tab_faltas")
public class Faltas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "funcionario_id",nullable = false)
    private Funcionario funcionario;
    private Integer estadofalta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    public Faltas() {
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

    public Integer getEstadofalta() {
        return estadofalta;
    }

    public void setEstadofalta(Integer estadofalta) {
        this.estadofalta = estadofalta;
    }

 
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "funcionario=" + funcionario.getNome() + ", estadofalta=" + estadofalta + ", data=" + data;
    }

    

    
}
