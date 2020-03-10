package com.framework.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *Read & Write from/to Property File
 */
public class PropertyUtils {
	
	
	public static String propertyFile_Read(String path, String key){
		Properties props = new Properties();
		
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
		} catch (IOException e) {
 			e.printStackTrace();
		}
		System.out.println("Property is read for "+key +"="+props.getProperty(key));

		return props.getProperty(key);
		
	}
	
	
	public static void propertyFile_Write(String path, String key, String value){
		
	Properties props = new Properties();
		
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			props.load(fis);
		} catch (FileNotFoundException e) {
 	//		e.printStackTrace();
		} catch (IOException e) {
 	//		e.printStackTrace();
		}
		
	 	
		
		try {
			if(value!=null){
				props.setProperty(key, value);
			props.store(new FileOutputStream(path), "");
			System.out.println("Property is set for "+key +"="+value);
 			}
			else
				System.out.println("Property NOT set for "+key);
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
		} catch (IOException e) {
 			e.printStackTrace();
		}
		
		
	}

}