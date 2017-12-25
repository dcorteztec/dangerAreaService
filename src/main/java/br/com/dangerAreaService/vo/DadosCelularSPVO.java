package br.com.dangerAreaService.vo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dados_cel_sp")
public class DadosCelularSPVO implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private int anoBO;
	private int numBO;
	private String numeroBoletim;
	private Date dataBoIniciada;
	private Date dataBoEmitido;
	private Date dataComunicacao;
	private Date dataHoraElaboracao;
	private Date dataOcorrencia;
	private String periodoOcorrencia;
	private Date dataComunicado;
	private String flagrante;
	private String numeroPrincipal;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String uf;
	private Double latitude;
	private Double longitude;
	private String descricaoLocal;
	private String exame;
	private String solucao;
	private String delegaciaNome;
	private String delegaciaCircunscricao;
	private String rubrica;
	private String especie;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAnoBO() {
		return anoBO;
	}
	public void setAnoBO(int anoBO) {
		this.anoBO = anoBO;
	}
	public int getNumBO() {
		return numBO;
	}
	public void setNumBO(int numBO) {
		this.numBO = numBO;
	}
	public String getNumeroBoletim() {
		return numeroBoletim;
	}
	public void setNumeroBoletim(String numeroBoletim) {
		this.numeroBoletim = numeroBoletim;
	}
	public Date getDataBoIniciada() {
		return dataBoIniciada;
	}
	public void setDataBoIniciada(Date dataBoIniciada) {
		this.dataBoIniciada = dataBoIniciada;
	}
	public Date getDataBoEmitido() {
		return dataBoEmitido;
	}
	public void setDataBoEmitido(Date dataBoEmitido) {
		this.dataBoEmitido = dataBoEmitido;
	}
	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public String getPeriodoOcorrencia() {
		return periodoOcorrencia;
	}
	public void setPeriodoOcorrencia(String periodoOcorrencia) {
		this.periodoOcorrencia = periodoOcorrencia;
	}
	public Date getDataComunicado() {
		return dataComunicado;
	}
	public void setDataComunicado(Date dataComunicado) {
		this.dataComunicado = dataComunicado;
	}
	public String getFlagrante() {
		return flagrante;
	}
	public void setFlagrante(String flagrante) {
		this.flagrante = flagrante;
	}
	public String getNumeroPrincipal() {
		return numeroPrincipal;
	}
	public void setNumeroPrincipal(String numeroPrincipal) {
		this.numeroPrincipal = numeroPrincipal;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getDescricaoLocal() {
		return descricaoLocal;
	}
	public void setDescricaoLocal(String descricaoLocal) {
		this.descricaoLocal = descricaoLocal;
	}
	public String getExame() {
		return exame;
	}
	public void setExame(String exame) {
		this.exame = exame;
	}
	public String getSolucao() {
		return solucao;
	}
	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}
	public String getDelegaciaNome() {
		return delegaciaNome;
	}
	public void setDelegaciaNome(String delegaciaNome) {
		this.delegaciaNome = delegaciaNome;
	}
	public String getDelegaciaCircunscricao() {
		return delegaciaCircunscricao;
	}
	public void setDelegaciaCircunscricao(String delegaciaCircunscricao) {
		this.delegaciaCircunscricao = delegaciaCircunscricao;
	}
	public String getRubrica() {
		return rubrica;
	}
	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}
	public Date getDataComunicacao() {
		return dataComunicacao;
	}
	public void setDataComunicacao(Date dataComunicacao) {
		this.dataComunicacao = dataComunicacao;
	}
	public Date getDataHoraElaboracao() {
		return dataHoraElaboracao;
	}
	public void setDataHoraElaboracao(Date dataHoraElaboracao) {
		this.dataHoraElaboracao = dataHoraElaboracao;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	
	
	
	
}
