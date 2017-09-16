package br.com.bingo.dominio;

import java.util.Date;

public class Bingo {

	private int id; 
	private String descricao;
	private Date dataRealizacao;
	private double valorCartela; 
	private String localRealizacao;
	private String organizacao;
	private Date dataCadastro;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataRealizacao() {
		return dataRealizacao;
	}
	public void setDataRealizacao(Date dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}
	public double getValorCartela() {
		return valorCartela;
	}
	public void setValorCartela(double valorCartela) {
		this.valorCartela = valorCartela;
	}
	public String getLocalRealizacao() {
		return localRealizacao;
	}
	public void setLocalRealizacao(String localRealizacao) {
		this.localRealizacao = localRealizacao;
	}
	public String getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	} 
	
	
}
