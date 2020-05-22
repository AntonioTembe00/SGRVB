package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ {

	public static volatile SingularAttribute<Funcionario, Integer> telefone;
	public static volatile SingularAttribute<Funcionario, Integer> estado;
	public static volatile SingularAttribute<Funcionario, String> endereco;
	public static volatile SingularAttribute<Funcionario, Date> data;
	public static volatile SingularAttribute<Funcionario, String> BI;
	public static volatile SingularAttribute<Funcionario, Double> salario;
	public static volatile SingularAttribute<Funcionario, Grupo> grupo;
	public static volatile SingularAttribute<Funcionario, String> nome;
	public static volatile SingularAttribute<Funcionario, String> senha;
	public static volatile SingularAttribute<Funcionario, Integer> id;
	public static volatile SingularAttribute<Funcionario, Date> dataNascimento;
	public static volatile SingularAttribute<Funcionario, Especialidade> especilidade;
	public static volatile SingularAttribute<Funcionario, String> email;

	public static final String TELEFONE = "telefone";
	public static final String ESTADO = "estado";
	public static final String ENDERECO = "endereco";
	public static final String DATA = "data";
	public static final String B_I = "BI";
	public static final String SALARIO = "salario";
	public static final String GRUPO = "grupo";
	public static final String NOME = "nome";
	public static final String SENHA = "senha";
	public static final String ID = "id";
	public static final String DATA_NASCIMENTO = "dataNascimento";
	public static final String ESPECILIDADE = "especilidade";
	public static final String EMAIL = "email";

}

