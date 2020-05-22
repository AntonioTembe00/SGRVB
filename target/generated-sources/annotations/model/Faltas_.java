package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Faltas.class)
public abstract class Faltas_ {

	public static volatile SingularAttribute<Faltas, Date> data;
	public static volatile SingularAttribute<Faltas, Integer> estadofalta;
	public static volatile SingularAttribute<Faltas, Integer> id;
	public static volatile SingularAttribute<Faltas, Funcionario> funcionario;

	public static final String DATA = "data";
	public static final String ESTADOFALTA = "estadofalta";
	public static final String ID = "id";
	public static final String FUNCIONARIO = "funcionario";

}

