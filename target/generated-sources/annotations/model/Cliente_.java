package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	public static volatile SingularAttribute<Cliente, String> senha;
	public static volatile SingularAttribute<Cliente, Integer> telefone;
	public static volatile SingularAttribute<Cliente, Integer> estado;
	public static volatile SingularAttribute<Cliente, Date> data;
	public static volatile SingularAttribute<Cliente, String> nome;
	public static volatile SingularAttribute<Cliente, Integer> id;
	public static volatile SingularAttribute<Cliente, String> email;
	public static volatile SingularAttribute<Cliente, String> confirmarsenha;

	public static final String SENHA = "senha";
	public static final String TELEFONE = "telefone";
	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String CONFIRMARSENHA = "confirmarsenha";

}

