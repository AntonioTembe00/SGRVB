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
@Table (name="tb_funcionario")
public class Funcionario implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    private Integer id;
    @Column (length=60, nullable = false) 
    private String nome; 
    @Column (length=60, nullable=false, unique = true)  private String email;
    @Column (length=60, nullable=false) private String senha;
    @Column (length=60, nullable=false, unique = true) private Integer telefone;
    @Column (length=60, nullable=false) private Date dataNascimento;
    @Column (length=60, nullable=false, unique = true) private String BI;
    @Column (length=500, nullable=false) private String endereco;
    @Column (length=500, nullable=false) private double salario;
    @ManyToOne
    @JoinColumn ( name = "grupo_id") private Grupo grupo;  
    @ManyToOne
    @JoinColumn ( name = "especialidade_id") private Especialidade especilidade;  
    private Integer estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;


    public Funcionario() {
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Especialidade getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(Especialidade especilidade) {
        this.especilidade = especilidade;
    }


    
 
    @Override
    public String toString() {
        return nome;
    } 
    
    
}
