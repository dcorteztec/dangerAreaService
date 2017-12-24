package br.com.dangerAreaService.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import br.com.dangerAreaService.util.Constantes;
import br.com.dangerAreaService.util.DataUtil;
import br.com.dangerAreaService.vo.DadosCelularSPVO;

@Service
public class ReadExcelCelularRouboFurto {

	

	@Autowired
	private DadosRouboFurtoCelularService dadosRouboFurtoCelularService;
	
	@SuppressWarnings("deprecation")
	public List<DadosCelularSPVO> readExcelFurto() {
		List<DadosCelularSPVO> dados = new ArrayList<DadosCelularSPVO>();
		try {
			
			File file = new ClassPathResource(Constantes.DADOS_FURTOS_CELULAR).getFile();
			
			FileInputStream excelFile = new FileInputStream(file);
			
			InputStream input = new BufferedInputStream(excelFile);

            POIFSFileSystem fileSystem = new POIFSFileSystem(input);
            HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
            HSSFSheet sheet = workbook.getSheetAt(0);
            
            Iterator<Row> linhas = sheet.rowIterator();
            DataUtil dataUtil = new DataUtil();
            DadosCelularSPVO dadosCelularSPVO = new DadosCelularSPVO();
			dados.add(dadosCelularSPVO);
            while(linhas.hasNext()){
                HSSFRow linha = (HSSFRow) linhas.next();
                Iterator<Cell> celulas = linha.cellIterator();
                while(celulas.hasNext()){
                    HSSFCell celula = (HSSFCell) celulas.next();
					switch (celula.getColumnIndex()) {
					case 0:
						dadosCelularSPVO.setAnoBO(Integer.parseInt(celula.getStringCellValue()));
						break;
					case 1:
						dadosCelularSPVO.setNumBO(Integer.parseInt(celula.getStringCellValue()));
						 break;
					case 2:
						dadosCelularSPVO.setDataBoEmitido(dataUtil.stringToDatehour(celula.getStringCellValue()));
						 break;
					case 3:
						dadosCelularSPVO.setDataOcorrencia(dataUtil.stringToDate(celula.getStringCellValue()));
						 break;
					case 4:
						dadosCelularSPVO.setPeriodoOcorrencia(celula.getStringCellValue());
						 break;
					case 5:
						dadosCelularSPVO.setDataComunicacao(dataUtil.stringToDatehour(celula.getStringCellValue()));
						 break;
					case 6:
						dadosCelularSPVO.setDataHoraElaboracao(dataUtil.stringToDatehour(celula.getStringCellValue()));
						 break;
					case 7:
						dadosCelularSPVO.setFlagrante(celula.getStringCellValue());
						 break;
					case 8:
						dadosCelularSPVO.setLogradouro(celula.getStringCellValue());
						 break;
					case 9:
						dadosCelularSPVO.setNumero(celula.getStringCellValue());
						 break;
					case 10:
						dadosCelularSPVO.setBairro(celula.getStringCellValue());
						 break;
					case 11:
						dadosCelularSPVO.setCidade(celula.getStringCellValue());
						 break;
					case 12:
						dadosCelularSPVO.setLatitude(Double.parseDouble(celula.getStringCellValue()));
						 break;
					case 13:
						dadosCelularSPVO.setLongitude(Double.parseDouble(celula.getStringCellValue()));
						 break;
					case 14:
						dadosCelularSPVO.setDescricaoLocal(celula.getStringCellValue());
						 break;
					case 15:
						dadosCelularSPVO.setSolucao(celula.getStringCellValue());
						 break;
					case 16:
						dadosCelularSPVO.setDelegaciaNome(celula.getStringCellValue());	
						 break;
					case 17:
						dadosCelularSPVO.setDelegaciaCircunscricao(celula.getStringCellValue());
						 break;
						
					case 18:
						dadosCelularSPVO.setEspecie(celula.getStringCellValue());
						 break;
						
					case 19:
						dadosCelularSPVO.setRubrica(celula.getStringCellValue());
						 break;
						
					default: // default clause should be the last one
					    break;
					}
					
					dadosRouboFurtoCelularService.salvar(dadosCelularSPVO);
                }
            }
           
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dados;
	}
}
