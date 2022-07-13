package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	
	private String configPath = ".\\src\\test\\resources\\input\\config.properties";
	private String log4JPath = ".\\src\\test\\resources\\input\\log4j.properties";
	
	
	public Base (){
		
		try {
		BufferedReader reader = new BufferedReader (new FileReader (configPath));
		properties = new Properties();
		properties.load(reader);
		reader.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger = logger.getLogger(log4JPath);
		PropertyConfigurator.configure(log4JPath);
	}
	public static String getURl(){
		String url = properties.getProperty("url");
		return url;
	}
	public static String getBrowser1 (){
		String browser = properties.getProperty("browser");
		return browser;
	}
	public static void launchBrowser () {
		driver.get(getURl());
	}
	
	public static void tearDown (){
		driver.quit();
		driver.close();
	}
	
	public static void selectBrowser (){
	
		switch (getBrowser1()) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		default: 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
