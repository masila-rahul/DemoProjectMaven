package com.utilities;

import java.io.*;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\admin\\eclipse_workspace\\DemoProject\\src\\test\\resources\\configFiles\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
	}

}
