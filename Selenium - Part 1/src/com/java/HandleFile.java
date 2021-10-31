package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HandleFile {

	public static void readPropertyFile(String key) {

		File fileLoc = new File("./config/objectRepo.properties");

		FileReader reader = null;

		try {
			reader = new FileReader(fileLoc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties property = new Properties();
		
		try {
			property.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String value = property.getProperty(key);
		
		System.out.println(value);

	}
	
	public static void main(String[] args) {
		
		readPropertyFile("Mobile");
		
		
		
	}

}
