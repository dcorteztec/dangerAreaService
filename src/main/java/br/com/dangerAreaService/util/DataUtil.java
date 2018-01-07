package br.com.dangerAreaService.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.dangerAreaService.ControllerLogger;

public class DataUtil extends ControllerLogger{

	public Date stringToDate(String dataStr) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		try {
			data = new java.sql.Date(format.parse(dataStr).getTime());
		} catch (ParseException e) {
			logger.error("error stringToDate");
		}
		return data;
	}
	
	public Date stringToDatehour(String dataStr) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = null;
		try {
			data = new java.sql.Date(format.parse(dataStr).getTime());
		} catch (ParseException e) {
			logger.error("error stringToDatehour");
		}
		return data;
	}

	public String stringToDatehour(Date dataOcorrencia) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		String reportDate = df.format(dataOcorrencia);
		return reportDate;
	}
	
}
