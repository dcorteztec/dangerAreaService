package br.com.dangerAreaService.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dangerAreaService.ControllerLogger;
import br.com.dangerAreaService.service.DadosRouboFurtoCelularService;
import br.com.dangerAreaService.service.ReadExcelCelularRouboFurto;
import br.com.dangerAreaService.util.Constantes;
import br.com.dangerAreaService.vo.DadosCelularSPVO;
import br.com.dangerAreaService.vo.helpervo.DadosMapHelperVO;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(Constantes.ESTATISTICA_FURTO_CELULAR)
@CrossOrigin(origins = "http://localhost:4200")
public class furtoController extends ControllerLogger{

	@Autowired
	private ReadExcelCelularRouboFurto readExcel;
	@Autowired
	private DadosRouboFurtoCelularService dadosRouboFurtoCelularService;
	
	@ApiOperation(value = "gerarBase", notes="Gera a base a partir de um excel, já previamente armezenado",nickname = "gerarBase")
	@RequestMapping(value = "/gerarBase", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public List<DadosCelularSPVO> gerandoBase() {
		 List<DadosCelularSPVO> ret = new ArrayList<>();
		try {
			ret = readExcel.readExcelFurto();
		} catch (IOException e) {
			 logger.error("This is an error gerandoBase()");
		}
		return ret;
	}
	

	@RequestMapping(value = "/listBase", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public List<DadosCelularSPVO> listBase() {
		 List<DadosCelularSPVO> ret = new ArrayList<>();
		try {
			ret = dadosRouboFurtoCelularService.findAll();
		} catch (Exception e) {
			 logger.error("This is an error listBase()");
		}
		return ret;
	}
	
	@RequestMapping(value = "/listBaseMap", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public List<DadosMapHelperVO> listBaseMap() {
		 List<DadosMapHelperVO> ret = new ArrayList<>();
		try {
			ret = dadosRouboFurtoCelularService.preparaDadosMap(dadosRouboFurtoCelularService.findAll());
		} catch (Exception e) {
			 logger.error("This is an error listBase()");
		}
		return ret;
	}
	
	@RequestMapping(value="getdadosByNumBo/{bo}", method = RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public DadosCelularSPVO getdadosByNumBo(@PathVariable("bo") final int bo){
		DadosCelularSPVO dados = new DadosCelularSPVO();
		try {
			dados = dadosRouboFurtoCelularService.findByBo(bo);
		} catch (Exception e) {
			 logger.error("This is an error getFurtoByBo()");
		}
		return dados;
	}
}
