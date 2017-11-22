package br.com.dangerAreaService.service.interfaces;

import java.util.List;

import br.com.dangerAreaService.vo.DangerPerfilTwitterVO;

public interface IDangerPerfilTwitterService {
	
	public void salvar(String perfil);
 
    public List<DangerPerfilTwitterVO> findAll();
 
    public long count();
 
    public DangerPerfilTwitterVO findById(String id);
 
    public void delete(String id);
}
