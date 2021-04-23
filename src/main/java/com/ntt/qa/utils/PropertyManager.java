package com.ntt.qa.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
	private Properties props = new Properties();

	public Properties getProps() {
		InputStream is = null;
		String propsFileName = "config.properties";

		if (props.isEmpty()) {
			try {
				is = getClass().getClassLoader().getResourceAsStream(propsFileName);
				props.load(is);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}

}
