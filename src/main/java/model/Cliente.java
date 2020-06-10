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
@Table (name="tb_cliente")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    private Integer id;
    @Column (length=60, nullable = false) 
    private String nome; 
    @Column (length=60, nullable=false, unique = true)  private String email;
    @Column (length=60, nullable=false) private String senha;
    @Column (length=60, nullable=false, unique = true) private Integer telefone;
  
    private Integer estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;


    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

 
    @Override
    public String toString() {
        return nome;
    } 
    
    
}
