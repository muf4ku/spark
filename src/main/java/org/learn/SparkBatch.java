package org.learn;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;

public class SparkBatch {
	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("app-name").setMaster("local[2]");
		JavaSparkContext jsc = new JavaSparkContext(conf);
		
		JavaRDD<String> rdd = jsc.textFile("E:\\data\\covid\\052020");
		
//		rdd.foreach(new VoidFunction<String>() {
//			
//			public void call(String t) throws Exception {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		System.out.println(rdd.count());
	}
}
