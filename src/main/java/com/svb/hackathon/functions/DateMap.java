package com.svb.hackathon.functions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;

public class DateMap implements Function<String[], String[]> {

	@Override
	public String[] call(String[] v1) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
		Date dt = format.parse(v1[0]);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		System.out.println(v1[0] + " - " + cal.getTime());
		
		String val1 = "" + cal.getTimeInMillis();
		String[] resp = {val1, v1[1]};
		
		return resp;
	}

}
