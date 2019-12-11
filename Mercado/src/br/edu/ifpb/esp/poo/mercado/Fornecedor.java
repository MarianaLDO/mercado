package br.edu.ifpb.esp.poo.mercado;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Fornecedor {
	
	@Id
	private Long id;
	private String nome;
	private Set<Produto> produtosFornecidos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Produto> getProdutosFornecidos() {
		return produtosFornecidos;
	}
	public void setProdutosFornecidos(Set<Produto> produtosFornecidos) {
		this.produtosFornecidos = produtosFornecidos;
	}
	
	
}
