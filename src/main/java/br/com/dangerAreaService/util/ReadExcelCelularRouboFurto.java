package br.com.dangerAreaService.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.dangerAreaService.vo.DadosCelularSPVO;

public class ReadExcelCelularRouboFurto {

	private static final String dadosFurtos = "/dangerAreaService/dados_publicos_xls/DadosBO_2017_9(FURTO DE CELULAR).xls";

	public List<DadosCelularSPVO> readExcelFurto() {
		List<DadosCelularSPVO> dados = new ArrayList<DadosCelularSPVO>();
		try {

			FileInputStream excelFile = new FileInputStream(new File(dadosFurtos));
			HSSFWorkbook workbook = new HSSFWorkbook(excelFile);
			DataUtil dataUtil = new DataUtil();
			HSSFSheet sheetDados = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheetDados.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				DadosCelularSPVO dadosCelularSPVO = new DadosCelularSPVO();
				dados.add(dadosCelularSPVO);
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 0:
						dadosCelularSPVO.setAnoBO(Integer.parseInt(cell.getStringCellValue()));
					
					case 1:
						dadosCelularSPVO.setNumBO(Integer.parseInt(cell.getStringCellValue()));
						
					case 4:
						dadosCelularSPVO.setDataBoEmitido(dataUtil.stringToDate(cell.getStringCellValue()));
					
					case 5:
						dadosCelularSPVO.setDataOcorrencia(dataUtil.stringToDate(cell.getStringCellValue()));
					
					case 6:
						dadosCelularSPVO.setPeriodoOcorrencia(cell.getStringCellValue());
					
					case 10:
						dadosCelularSPVO.setFlagrante(cell.getStringCellValue());
					
					case 12:
						dadosCelularSPVO.setLogradouro(cell.getStringCellValue());
					
					case 13:
						dadosCelularSPVO.setNumero(cell.getStringCellValue());
					
					case 14:
						dadosCelularSPVO.setBairro(cell.getStringCellValue());
						
					case 15:
						dadosCelularSPVO.setCidade(cell.getStringCellValue());
					
					case 16:
						dadosCelularSPVO.setLatitude(Double.parseDouble(cell.getStringCellValue()));
					
					case 17:
						dadosCelularSPVO.setLongitude(Double.parseDouble(cell.getStringCellValue()));
					
					case 18:
						dadosCelularSPVO.setDescricaoLocal(cell.getStringCellValue());
						
					case 19:
						dadosCelularSPVO.setDelegaciaNome(cell.getStringCellValue());	
						
					case 20:
						dadosCelularSPVO.setDelegaciaCircunscricao(cell.getStringCellValue());
					
					case 22:
						dadosCelularSPVO.setRubrica(cell.getStringCellValue());	
					}
				}
			}
			excelFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dados;
	}
}
