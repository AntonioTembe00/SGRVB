package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Especialidade.class)
public abstract class Especialidade_ {

	public static volatile SingularAttribute<Especialidade, Integer> estado;
	public static volatile SingularAttribute<Especialidade, Date> data;
	public static volatile SingularAttribute<Especialidade, String> nome;
	public static volatile SingularAttribute<Especialidade, Integer> id;
	public static volatile SingularAttribute<Especialidade, String> descricao;

	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

