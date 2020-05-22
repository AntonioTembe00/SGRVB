package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mensagem.class)
public abstract class Mensagem_ {

	public static volatile SingularAttribute<Mensagem, String> assunto;
	public static volatile SingularAttribute<Mensagem, Integer> estado;
	public static volatile SingularAttribute<Mensagem, Funcionario> receptor;
	public static volatile SingularAttribute<Mensagem, Date> data;
	public static volatile SingularAttribute<Mensagem, Funcionario> emissor;
	public static volatile SingularAttribute<Mensagem, Integer> id;
	public static volatile SingularAttribute<Mensagem, String> descricao;

	public static final String ASSUNTO = "assunto";
	public static final String ESTADO = "estado";
	public static final String RECEPTOR = "receptor";
	public static final String DATA = "data";
	public static final String EMISSOR = "emissor";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

