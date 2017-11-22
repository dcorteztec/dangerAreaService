package br.com.dangerAreaService.vo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dangertwitter")
public class DangerPerfilTwitterVO implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	@NotBlank
	private String perfil;
	
	public DangerPerfilTwitterVO(String perfil) {
		this.perfil = perfil;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
}
