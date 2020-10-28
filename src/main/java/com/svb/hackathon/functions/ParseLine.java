package com.svb.hackathon.functions;

import org.apache.spark.api.java.function.Function;
import au.com.bytecode.opencsv.CSVReader;
import java.io.StringReader;


public class ParseLine implements Function<String, String[]> {

	@Override
	public String[] call(String line) throws Exception {
		CSVReader reader = new CSVReader(new StringReader(line)); 
		return reader.readNext();
	}

}
