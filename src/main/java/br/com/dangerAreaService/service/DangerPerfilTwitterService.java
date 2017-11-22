package br.com.dangerAreaService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dangerAreaService.repository.DangerPerfilTwitterRepository;
import br.com.dangerAreaService.service.interfaces.IDangerPerfilTwitterService;
import br.com.dangerAreaService.vo.DangerPerfilTwitterVO;

@Service
public class DangerPerfilTwitterService implements IDangerPerfilTwitterService{

	@Autowired
	private DangerPerfilTwitterRepository repository;

	@Override
	public void salvar(String perfil) {
	repository.save(new DangerPerfilTwitterVO(perfil));
	}

	@Override
	public List<DangerPerfilTwitterVO> findAll() {
		return repository.findAll();
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public DangerPerfilTwitterVO findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);
	}
	
	
	
}
