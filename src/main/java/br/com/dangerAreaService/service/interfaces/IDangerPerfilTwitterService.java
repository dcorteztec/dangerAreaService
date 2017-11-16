package br.com.dangerAreaService.service.interfaces;

import java.util.List;

import br.com.dangerAreaService.vo.DangerPerfilTwitter;

public interface IDangerPerfilTwitterService {
	
	public void salvar(String perfil);
 
    public List<DangerPerfilTwitter> findAll();
 
    public long count();
 
    public DangerPerfilTwitter findById(String id);
 
    public void delete(String id);
}
