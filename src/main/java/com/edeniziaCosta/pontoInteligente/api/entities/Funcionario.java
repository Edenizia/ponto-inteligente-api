package com.edeniziaCosta.pontoInteligente.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	private Empresa empresa;
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
    
	@Column(name = "email", nullable = false )
	public void setEmail(String email) {
		this.email = email;
	}
    
	@Column(name = "senha", nullable = false )
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
    
	@Column(name = "cpf", nullable = false )
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}
    
	@Column(name = "valor_hora", nullable = false )
	public void setValorHora(BigDecimal valorHora) {
		this.valorHora = valorHora;
	}
    
	@Transient
	public Optional<BigDecimal> getValorHoraOpt(){
		return Optional.ofNullable(valorHora);
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
	
	@Transient
	public Optional<Float> getQtdHorasTrabalhoDiaOpt(){
	    return Optional.ofNullable(qtasHorasTrabalhoDia);	
	}
    
	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false )
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
    
	@Column(name = "dataAtualizacao", nullable = false )
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
    
	@ManyToOne(fetch = FetchType.EAGER)
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEpresa(Empresa empresa) {
		this.empresa = empresa;
	}
    
	@OneToMany(mappedBy= "lancamento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<Lancamento> getLancamento() {
		return lancamento;
	}

	public void setLancamento(List<Lancamento> lancamento) {
		this.lancamento = lancamento;
	}

	

}
