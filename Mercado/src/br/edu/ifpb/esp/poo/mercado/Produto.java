package br.edu.ifpb.esp.poo.mercado;

import java.math.BigDecimal;
import java.util.Calendar;

public class Produto {

	
	private Long id;
	private BigDecimal preco;
	private Calendar dataDeValidade;
	private Vendas venda;
	private Fornecedor fornecedor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Calendar getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(Calendar dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	public Vendas getVenda() {
		return venda;
	}
	public void setVenda(Vendas venda) {
		this.venda = venda;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
