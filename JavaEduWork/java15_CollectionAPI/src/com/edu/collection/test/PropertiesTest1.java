package com.edu.collection.test;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration e = p.propertyNames();
		
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			String value = p.getProperty(key);
			System.out.println(key + "==========" +value);

		}
	}

}
