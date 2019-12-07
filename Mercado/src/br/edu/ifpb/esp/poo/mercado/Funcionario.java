package br.edu.ifpb.esp.poo.mercado;

import java.math.BigDecimal;
import java.util.Calendar;

public class Funcionario {

	private Long id;
	private String nome;
	private Calendar dataDeContratacao;
	private BigDecimal salario;
	
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
	public Calendar getDataDeContratacao() {
		return dataDeContratacao;
	}
	public void setDataDeContratacao(Calendar dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
}
