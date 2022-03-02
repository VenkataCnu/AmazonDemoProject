package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File path = new File ("D:\\MyWorkSpace\\AmazonDemoProject\\Configuration\\configuration.properties");
		try {
			FileInputStream fis = new FileInputStream(path);
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		String url = pro.getProperty("baseURL");
		return url;

	}

	public String getUser() {
		String user = pro.getProperty("username");
		return user;
	}

	public String getPassword() {
		String pwd = pro.getProperty("password");
		return pwd;
	}

	public String getChromepath() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}

	public String getIepath() {
		String ie = pro.getProperty("iepath");
		return ie;
	}

	public String getfirefoxpath() {
		String firefox = pro.getProperty("firefoxpath");
		return firefox;
	}

}
