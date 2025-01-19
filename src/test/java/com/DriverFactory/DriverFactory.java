package com.DriverFactory;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import com.utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	/*This method is used to initialize the thread local driver on the basis of given browser
	 * this will reurn tldriver
	 */
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is :" + browser);
		if(browser.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 tlDriver.set(new ChromeDriver());
		}
		
		else if(browser.equals("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 tlDriver.set(new FirefoxDriver());
		}
		
		else if(browser.equals("safari")) {
			 WebDriverManager.safaridriver().setup();
			 tlDriver.set(new SafariDriver());
		}
		
		else if(browser.equals("edge")) {
			 WebDriverManager.edgedriver().setup();
			 tlDriver.set(new EdgeDriver());
		}
		
		else {
			System.out.println("Please pass the correct browser");
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
}


