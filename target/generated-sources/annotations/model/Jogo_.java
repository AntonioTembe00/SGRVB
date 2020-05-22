package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Jogo.class)
public abstract class Jogo_ {

	public static volatile SingularAttribute<Jogo, Integer> estado;
	public static volatile SingularAttribute<Jogo, String> foto;
	public static volatile SingularAttribute<Jogo, Date> data;
	public static volatile SingularAttribute<Jogo, Categoria> categoria;
	public static volatile SingularAttribute<Jogo, String> nome;
	public static volatile SingularAttribute<Jogo, Integer> id;
	public static volatile SingularAttribute<Jogo, String> descricao;

	public static final String ESTADO = "estado";
	public static final String FOTO = "foto";
	public static final String DATA = "data";
	public static final String CATEGORIA = "categoria";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String DESCRICAO = "descricao";

}

