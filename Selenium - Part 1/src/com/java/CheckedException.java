package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

// Checked Exception

public class CheckedException {

	public static void main(String[] args) {

		FileReader fir = null;

		try {
			File loc = new File("./fil.properties");

			fir = new FileReader(loc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties prop = new Properties();

		try {
			prop.load(fir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			
			System.out.println(e);
		}
		
		catch(Throwable e) {
			
			System.out.println(e);
		}

		
		System.out.println(prop.getProperty("name"));
		
		System.out.println("End");
//		BufferedReader br = new BufferedReader(new InputStreamReader
		//(System.in));
//
//		int num = 0;
//
//		try {
//
//			String s = br.readLine();
//
//			num = Integer.parseInt(s);
//
//		}
//
//		catch (IOException e) {
//
//			System.out.println(e);
//		} finally {
//		}
//
//		System.out.println("End");

	}
}
