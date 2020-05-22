package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reserva.class)
public abstract class Reserva_ {

	public static volatile SingularAttribute<Reserva, Cliente> cliente;
	public static volatile SingularAttribute<Reserva, Evento> evento;
	public static volatile SingularAttribute<Reserva, Integer> estado;
	public static volatile SingularAttribute<Reserva, Date> data;
	public static volatile SingularAttribute<Reserva, Integer> id;
	public static volatile SingularAttribute<Reserva, String> estadoReserva;
	public static volatile SingularAttribute<Reserva, Integer> quantidade;

	public static final String CLIENTE = "cliente";
	public static final String EVENTO = "evento";
	public static final String ESTADO = "estado";
	public static final String DATA = "data";
	public static final String ID = "id";
	public static final String ESTADO_RESERVA = "estadoReserva";
	public static final String QUANTIDADE = "quantidade";

}

