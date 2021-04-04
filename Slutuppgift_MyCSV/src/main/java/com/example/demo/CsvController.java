package com.example.demo;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CsvController {

	
	
	@RequestMapping(value = "/easyWayshowCSVJSON", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) //per row, eventuellt för alfanumerisk BONUS..
	public ArrayList<ArrayList<String>> easyWayShowCSVJSON() {
		return readCSV.getWholeSheet();
	}
	
	@RequestMapping(value = "/showCSVJSON", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) // med pattern
	public String showCSVJSON() {
		return betaSolution.CsvToJSON();
	}

	@RequestMapping(value = "{column}", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> ColumnPath(
	 @PathVariable("column") String id) {
	  return betaSolution.Column(id);
	}
	
	@RequestMapping(value = "/showErrorDetection", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) // 
	public ArrayList<String> showErrorDetection() {
		return betaSolution.errorDetection();
	}
	
	
}