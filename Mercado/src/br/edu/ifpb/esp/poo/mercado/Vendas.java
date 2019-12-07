package br.edu.ifpb.esp.poo.mercado;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Set;

public class Vendas {

	private Long id;
	private BigDecimal valorDaVenda;
	private Calendar dataDaVenda;
	private Funcionario funcionarioDaVenda;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getValorDaVenda() {
		return valorDaVenda;
	}
	public void setValorDaVenda(BigDecimal valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}
	public Calendar getDataDaVenda() {
		return dataDaVenda;
	}
	public void setDataDaVenda(Calendar dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}
	public Funcionario getFuncionarioDaVenda() {
		return funcionarioDaVenda;
	}
	public void setFuncionarioDaVenda(Funcionario funcionarioDaVenda) {
		this.funcionarioDaVenda = funcionarioDaVenda;
	}
	
	
}
