package br.com.fiap.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pedido")
public class Pedido {
	
	@Id
	@Column(name="idPedido")
	private int idPedido;
	
	@Column(name="idPedido")
	private Date DataPedido;
	
	@Column(name="idCliente")
	private int idCliente;
	
	@Column(name="Categoria")
	private String Categoria;
}
