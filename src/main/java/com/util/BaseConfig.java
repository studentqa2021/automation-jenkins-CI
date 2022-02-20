package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getValue(String value) throws Exception  {
		
	String path ="./config.properties";//location
	FileInputStream fis = new FileInputStream(path);//stream
	
	//read file
	Properties pro = new Properties();
	pro.load(fis);
	
	
	return pro.get(value).toString();
	}
	

}
