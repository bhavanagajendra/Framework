package com.generic;

import java.io.IOException;
import java.util.Properties;

public class Generic {

	static Properties prop = new Properties();
	
	public void getProperties()
	{
		try {
		    //load a properties file from class path, inside static method
		    prop.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
	}
}
