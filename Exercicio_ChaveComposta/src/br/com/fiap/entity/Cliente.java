package br.com.fiap.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "Empresa")
	private String Empresa;

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER.LAZY, mappedBy="Cliente")
	private Set<Pedido> pedidos = new LinkedHashSet<Pedido>(); 
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER.LAZY, mappedBy="Cliente")
	private Set<Endereco> enderecos = new LinkedHashSet<Endereco>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


}
