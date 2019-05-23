package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class Endereco {

	@Id
	@Column(name="Id")
	private int id;

	@Column(name="Rua")
	private String Rua;

	@Column(name="Cidade")
	private String Cidade;

	@Column(name="Cep")
	private String Cep;
}
