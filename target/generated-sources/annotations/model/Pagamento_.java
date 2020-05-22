package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Integer> estado;
	public static volatile SingularAttribute<Pagamento, Date> data;
	public static volatile SingularAttribute<Pagamento, String> estadopagamento;
	public static volatile SingularAttribute<Pagamento, Integer> id;
	public static volatile SingularAttribute<Pagamento, Reserva> reserva;
	public static volatile SingularAttribute<Pagamento, Tipopagamento> tipopagamento;

	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String ESTADOPAGAMENTO = "estadopagamento";
	public static final String ID = "id";
	public static final String RESERVA = "reserva";
	public static final String TIPOPAGAMENTO = "tipopagamento";

}

