package br.com.dangerAreaService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.dangerAreaService.vo.DadosCelularSPVO;

public interface IFurtoRouboCelularRepository extends MongoRepository<DadosCelularSPVO, Long>{

}
