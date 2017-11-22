package br.com.dangerAreaService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.dangerAreaService.vo.DangerPerfilTwitterVO;

public interface DangerPerfilTwitterRepository extends MongoRepository<DangerPerfilTwitterVO, String>{

}

