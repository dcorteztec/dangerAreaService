package br.com.dangerAreaService.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dangerAreaService.ControllerLogger;
import br.com.dangerAreaService.service.ReadExcelCelularRouboFurto;
import br.com.dangerAreaService.util.Constantes;
import br.com.dangerAreaService.vo.DadosCelularSPVO;


@RestController
@RequestMapping(Constantes.ESTATISTICA_FURTO_CELULAR)
public class GerarBaseCalc extends ControllerLogger{

	@Autowired
	private ReadExcelCelularRouboFurto readExcel;
	
	@RequestMapping(value = "/gerarBase", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public List<DadosCelularSPVO> gerendoBase() {
		
		try {
			return readExcel.readExcelFurto();
		} catch (IOException e) {
			 logger.error("This is an error gerendoBase()");
		}
		return null;
	}
}
