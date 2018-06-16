package com.edeniziaCosta.pontoInteligente.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.edeniziaCosta.pontoInteligente.enums.PerfilEnum;

@Entity
@Table(name= "funcionario")

public class Funcionario implements Serializable {
	
	public static final long serialVersionUID = -5754246207015712518L;
	
	
	private String name;
	private String email;
	private String senha;
	private String cpf;
	private BigDecimal valorHora;
	private Float qtasHorasTrabalhoDia;
	private Float qtasHorasAlmoco;
	private PerfilEnum perfil;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private Empresa epresa;
	private List<Lancamento> lancamento;
	
	public Funcionario() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	  public long getId() {
		return id;
	}
	
	
	private long id;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public void setValorHora(BigDecimal valorHora) {
		this.valorHora = valorHora;
	}

	public Float getQtasHorasTrabalhoDia() {
		return qtasHorasTrabalhoDia;
	}

	public void setQtasHorasTrabalhoDia(Float qtasHorasTrabalhoDia) {
		this.qtasHorasTrabalhoDia = qtasHorasTrabalhoDia;
	}

	public Float getQtasHorasAlmoco() {
		return qtasHorasAlmoco;
	}

	public void setQtasHorasAlmoco(Float qtasHorasAlmoco) {
		this.qtasHorasAlmoco = qtasHorasAlmoco;
	}

	public PerfilEnum getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Empresa getEpresa() {
		return epresa;
	}

	public void setEpresa(Empresa epresa) {
		this.epresa = epresa;
	}

	public List<Lancamento> getLancamento() {
		return lancamento;
	}

	public void setLancamento(List<Lancamento> lancamento) {
		this.lancamento = lancamento;
	}

	

}
