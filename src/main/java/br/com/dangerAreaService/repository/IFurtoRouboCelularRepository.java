package br.com.dangerAreaService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.dangerAreaService.vo.DadosCelularSPVO;
import org.springframework.data.mongodb.repository.Query;

public interface IFurtoRouboCelularRepository extends MongoRepository<DadosCelularSPVO, Long>{

    @Query("{'numBO' : ?0 }")
	  DadosCelularSPVO findByBo(int bo);
}
