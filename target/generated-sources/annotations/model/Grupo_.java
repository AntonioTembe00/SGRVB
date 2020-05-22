package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Grupo.class)
public abstract class Grupo_ {

	public static volatile SingularAttribute<Grupo, Integer> estado;
	public static volatile SingularAttribute<Grupo, Date> data;
	public static volatile SingularAttribute<Grupo, String> nome;
	public static volatile SingularAttribute<Grupo, Integer> id;
	public static volatile SingularAttribute<Grupo, String> descricao;

	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

