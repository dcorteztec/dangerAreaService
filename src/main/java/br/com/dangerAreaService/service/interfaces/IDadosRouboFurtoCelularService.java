package br.com.dangerAreaService.service.interfaces;

import java.util.List;

import br.com.dangerAreaService.vo.DadosCelularSPVO;

public interface IDadosRouboFurtoCelularService {

	public void salvar(DadosCelularSPVO dadosCelularSPVO);
	 
    public List<DadosCelularSPVO> findAll();
 
    public long count();
 
    public DadosCelularSPVO findById(Long id);
 
    public void delete(Long id);
}
