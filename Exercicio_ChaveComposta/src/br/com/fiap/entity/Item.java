package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Item")
public class Item {
	
	@Id
	@Column(name="Id")
	private int Id;
	
	@Column(name="numPedido")
	private int numPedido;

	@Column(name="quatidade")
	private Double quatidade; 
	
	@Column(name="Categoria")
	private String Categoria;
	
}
