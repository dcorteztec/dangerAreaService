package br.com.dangerAreaService.service.interfaces;

import java.util.List;

import br.com.dangerAreaService.vo.DadosCelularSPVO;

public interface IDadosRouboFurtoCelularService {

	public void salvar(List<DadosCelularSPVO> listDados);
	 
    public List<DadosCelularSPVO> findAll();
 
    public long count();
 
    public DadosCelularSPVO findById(Long id);
 
    public void delete(Long id);
	
	  public DadosCelularSPVO findByBo(int bo); 
}
