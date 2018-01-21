package br.com.dangerAreaService.vo.helpervo;

public class DadosMapHelperVO {

	private String dataOcorrenciaForMap;
	private String logradouroForMap;
	private String numeroForMap;
	private String bairroForMap;
	private String cidadeForMap;
	//private String ufForMap;
	private Double latitudeForMap;
	private Double longitudeForMap;
	
	public DadosMapHelperVO() {
		super();
	}

	public String getDataOcorrenciaForMap() {
		return dataOcorrenciaForMap;
	}

	public void setDataOcorrenciaForMap(String dataOcorrenciaForMap) {
		this.dataOcorrenciaForMap = dataOcorrenciaForMap;
	}

	public String getLogradouroForMap() {
		return logradouroForMap;
	}

	public void setLogradouroForMap(String logradouroForMap) {
		this.logradouroForMap = logradouroForMap;
	}

	public String getNumeroForMap() {
		return numeroForMap;
	}

	public void setNumeroForMap(String numeroForMap) {
		this.numeroForMap = numeroForMap;
	}

	public String getBairroForMap() {
		return bairroForMap;
	}

	public void setBairroForMap(String bairroForMap) {
		this.bairroForMap = bairroForMap;
	}

	public String getCidadeForMap() {
		return cidadeForMap;
	}

	public void setCidadeForMap(String cidadeForMap) {
		this.cidadeForMap = cidadeForMap;
	}

//	public String getUfForMap() {
//		return ufForMap;
//	}
//
//	public void setUfForMap(String ufForMap) {
//		this.ufForMap = ufForMap;
//	}

	public Double getLatitudeForMap() {
		return latitudeForMap;
	}

	public void setLatitudeForMap(Double latitudeForMap) {
		this.latitudeForMap = latitudeForMap;
	}

	public Double getLongitudeForMap() {
		return longitudeForMap;
	}

	public void setLongitudeForMap(Double longitudeForMap) {
		this.longitudeForMap = longitudeForMap;
	}
	
	
	
}
