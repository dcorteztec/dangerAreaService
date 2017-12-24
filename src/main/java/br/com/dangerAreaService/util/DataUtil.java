package br.com.dangerAreaService.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	public Date stringToDate(String dataStr) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		try {
			data = new java.sql.Date(format.parse(dataStr).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public Date stringToDatehour(String dataStr) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = null;
		try {
			data = new java.sql.Date(format.parse(dataStr).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return data;
	}
	
}
