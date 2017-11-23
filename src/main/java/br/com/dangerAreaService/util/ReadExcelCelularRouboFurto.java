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
import org.apache.poi.ss.usermodel.Row;

import br.com.dangerAreaService.vo.DadosCelularSPVO;

public class ReadExcelCelularRouboFurto {

	private static final String dadosFurtos = "/dangerAreaService/dados_publicos_xls";

	public List<DadosCelularSPVO> readExcelFurto() {
		List<DadosCelularSPVO> dados = new ArrayList<DadosCelularSPVO>();
		try {

			FileInputStream excelFile = new FileInputStream(new File(dadosFurtos));
			HSSFWorkbook workbook = new HSSFWorkbook(excelFile);

			HSSFSheet sheetDados = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheetDados.iterator();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dados;
	}
}
