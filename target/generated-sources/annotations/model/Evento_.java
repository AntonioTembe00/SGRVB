package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Evento.class)
public abstract class Evento_ {

	public static volatile SingularAttribute<Evento, Integer> estado;
	public static volatile SingularAttribute<Evento, Integer> bilhetesDisponiveis;
	public static volatile SingularAttribute<Evento, String> estadoevento;
	public static volatile SingularAttribute<Evento, Date> data;
	public static volatile SingularAttribute<Evento, Double> valor;
	public static volatile SingularAttribute<Evento, Integer> id;
	public static volatile SingularAttribute<Evento, Date> datajogo;
	public static volatile SingularAttribute<Evento, Jogo> jogo;
	public static volatile SingularAttribute<Evento, String> descricao;

	public static final String ESTADO = "estado";
	public static final String BILHETES_DISPONIVEIS = "bilhetesDisponiveis";
	public static final String ESTADOEVENTO = "estadoevento";
	public static final String DATA = "data";
	public static final String VALOR = "valor";
	public static final String ID = "id";
	public static final String DATAJOGO = "datajogo";
	public static final String JOGO = "jogo";
	public static final String DESCRICAO = "descricao";

}

