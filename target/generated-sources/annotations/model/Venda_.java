package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Venda.class)
public abstract class Venda_ {

	public static volatile SingularAttribute<Venda, Evento> evento;
	public static volatile SingularAttribute<Venda, Integer> estado;
	public static volatile SingularAttribute<Venda, Date> data;
	public static volatile SingularAttribute<Venda, Integer> id;
	public static volatile SingularAttribute<Venda, Funcionario> funcionario;
	public static volatile SingularAttribute<Venda, Integer> quantidade;

	public static final String EVENTO = "evento";
	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String ID = "id";
	public static final String FUNCIONARIO = "funcionario";
	public static final String QUANTIDADE = "quantidade";

}

