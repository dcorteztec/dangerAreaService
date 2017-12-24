package br.com.dangerAreaService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dangerAreaService.service.ReadExcelCelularRouboFurto;
import br.com.dangerAreaService.util.Constantes;


@RestController
@RequestMapping(Constantes.ESTATISTICA_FURTO_CELULAR)
public class GerarBaseCalc {

	@Autowired
	private ReadExcelCelularRouboFurto readExcel;
	
	@RequestMapping(value = "/gerarBase", method = RequestMethod.GET)
	public String gerendoBase() {
		readExcel.readExcelFurto();
		return "<h1>Base Gerada!!!</h1>";
	}
}
