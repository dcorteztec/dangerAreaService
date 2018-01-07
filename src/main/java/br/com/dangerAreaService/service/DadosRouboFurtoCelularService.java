package br.com.dangerAreaService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dangerAreaService.repository.IFurtoRouboCelularRepository;
import br.com.dangerAreaService.service.interfaces.IDadosRouboFurtoCelularService;
import br.com.dangerAreaService.util.DataUtil;
import br.com.dangerAreaService.vo.DadosCelularSPVO;
import br.com.dangerAreaService.vo.helpervo.DadosMapHelperVO;

@Service
public class DadosRouboFurtoCelularService implements IDadosRouboFurtoCelularService{

	@Autowired 
    private IFurtoRouboCelularRepository repository;
	
	@Override
	public void salvar(List<DadosCelularSPVO> listDados) {
		repository.save(listDados);
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
	public DadosCelularSPVO findByBo(int bo) {
		return repository.findByBo(bo);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
		
	}

	public List<DadosMapHelperVO> preparaDadosMap(List<DadosCelularSPVO> findAll) {
		 List<DadosMapHelperVO> ret = new ArrayList<>();
		 DataUtil dataUtil = new DataUtil();
		 findAll.forEach(item->{
				DadosMapHelperVO dados = new DadosMapHelperVO();
				dados.setBairro(item.getBairro());
				dados.setCidade(item.getCidade());
				dados.setDataOcorrencia(dataUtil.stringToDatehour(item.getDataOcorrencia()));
				dados.setLatitude(item.getLatitude());
				dados.setLongitude(item.getLongitude());
				dados.setNumero(item.getNumero());
				dados.setUf(item.getUf());
				ret.add(dados);
			});		 
		return ret;
	}

}
