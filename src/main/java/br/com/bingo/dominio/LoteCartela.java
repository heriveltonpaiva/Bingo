package br.com.bingo.dominio;

import java.util.Date;

public class LoteCartela {

	private int id;
	private int numeroLote;
	private int quantidade;
	private Date dataGeracao;
	private Bingo bingo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getDataGeracao() {
		return dataGeracao;
	}
	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}
	public Bingo getBingo() {
		return bingo;
	}
	public void setBingo(Bingo bingo) {
		this.bingo = bingo;
	}
	
	
	
}
