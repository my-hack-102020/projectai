package com.svb.hackathon.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.spark.api.java.JavaDoubleRDD;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.ml.regression.LinearRegression;
import org.apache.spark.ml.regression.LinearRegressionModel;
import org.apache.spark.ml.regression.LinearRegressionTrainingSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;
import org.apache.spark.mllib.regression.LabeledPoint;
import org.apache.spark.mllib.stat.MultivariateStatisticalSummary;
import org.apache.spark.mllib.stat.Statistics;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import com.cloudera.sparkts.models.ARIMA;
import com.cloudera.sparkts.models.ARIMAModel;
import com.svb.hackathon.dto.HackathonResponse;
import com.svb.hackathon.functions.DateMap;
import com.svb.hackathon.functions.ParseLine;

@Service
public class HackathonService {

	@Autowired
	JavaSparkContext sc;
	
	@Autowired
    private SparkSession sparkSession;
	
	public HackathonResponse getNextFundingDate(String clientId)
	{
		
//		Dataset<Row> data = sparkSession.read().csv("GWaddr2333.csv");
//		
//		LinearRegression lr = new LinearRegression()
//				  .setMaxIter(10)
//				  .setRegParam(0.3)
//				  .setElasticNetParam(0.8);
//		
//		LinearRegressionModel lrModel = lr.fit(data);
//		
//		System.out.println("Coefficients: "
//				  + lrModel.coefficients() + " Intercept: " + lrModel.intercept());
		
		HackathonResponse resp = new HackathonResponse();
		
		JavaRDD<String> lines = sc.textFile("GWaddr2333.csv");
		JavaRDD<String[]> csvData = lines.map(new ParseLine());
		
		csvData.collect().forEach(val -> {
			System.out.println(val[0] + ":" + val[1]);
		});
		
		JavaRDD<String[]> monthMap = csvData.map(new DateMap());
		List<Long> s1 = new ArrayList<Long>();
		List<Double> s2 = new ArrayList<Double>();
		
		monthMap.collect().forEach(val -> {
			s1.add(Long.parseLong(val[0]));
			s2.add(Double.parseDouble(val[1]));
			System.out.println(val[0] + ":" + val[1]);
		});
		
		JavaRDD seriesX = sc.parallelize(s1);
		JavaRDD seriesY = sc.parallelize(s2);
		
/*
		
		JavaRDD<Double> data_points = lines.map(new Function<String, Double>() {

			@Override
			public Double call(String line) throws Exception {
				// TODO Auto-generated method stub
				Double val = Double.parseDouble(line);
				return val;
			}
			
		});

		List<Double> doubleList = data_points.collect();

		Double[] doubleArray = new Double[doubleList.size()];
		doubleArray = doubleList.toArray(doubleArray);

		double[] values = new double[doubleArray.length];
		for (int i = 0; i < doubleArray.length; i++){
			values[i] = doubleArray[i];
		}

		Vector tsVector = Vectors.dense(values);
		System.out.println("TS vector:" + tsVector.toString());

		ARIMAModel arimaModel = ARIMA.autoFit(tsVector, 1, 0, 1);

		System.out.println("*** ARIMA Model Coefficients ***");
		for (double coefficient : arimaModel.coefficients()){
			System.out.println("ARIMA model coefficient:" + coefficient);

		}

		Vector forecast = arimaModel.forecast(tsVector, 10);
		System.out.println("ARIMA model forecast for next 10 observations:" + forecast);
		*/
		return null;
	}
}
