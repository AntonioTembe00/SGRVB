package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ferias.class)
public abstract class Ferias_ {

	public static volatile SingularAttribute<Ferias, Integer> estado;
	public static volatile SingularAttribute<Ferias, Date> dataFim;
	public static volatile SingularAttribute<Ferias, Integer> id;
	public static volatile SingularAttribute<Ferias, Funcionario> funcionario;
	public static volatile SingularAttribute<Ferias, Date> dataInicio;

	public static final String ESTADO = "estado";
	public static final String DATA_FIM = "dataFim";
	public static final String ID = "id";
	public static final String FUNCIONARIO = "funcionario";
	public static final String DATA_INICIO = "dataInicio";

}

