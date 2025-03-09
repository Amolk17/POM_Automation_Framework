package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	public Properties initializeProperties() {
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fip);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}
