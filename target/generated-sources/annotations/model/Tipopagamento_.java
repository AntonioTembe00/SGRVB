package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tipopagamento.class)
public abstract class Tipopagamento_ {

	public static volatile SingularAttribute<Tipopagamento, Integer> estado;
	public static volatile SingularAttribute<Tipopagamento, Date> data;
	public static volatile SingularAttribute<Tipopagamento, String> nome;
	public static volatile SingularAttribute<Tipopagamento, Integer> id;
	public static volatile SingularAttribute<Tipopagamento, String> descricao;

	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

