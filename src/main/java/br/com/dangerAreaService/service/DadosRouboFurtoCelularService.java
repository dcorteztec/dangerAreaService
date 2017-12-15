package br.com.dangerAreaService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dangerAreaService.repository.IFurtoRouboCelularRepository;
import br.com.dangerAreaService.service.interfaces.IDadosRouboFurtoCelularService;
import br.com.dangerAreaService.vo.DadosCelularSPVO;

@Service
public class DadosRouboFurtoCelularService implements IDadosRouboFurtoCelularService{

	@Autowired 
    private IFurtoRouboCelularRepository repository;
	
	@Override
	public void salvar(DadosCelularSPVO dadosCelularSPVO) {
		repository.save(dadosCelularSPVO);
	}

	@Override
	public List<DadosCelularSPVO> findAll() {
		return repository.findAll();
	}

	@Override
	public long count() {
		return repository.findAll().size();
	}

	@Override
	public DadosCelularSPVO findById(Long id) {
		return repository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
		
	}

}
