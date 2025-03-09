package com.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver initDriver(String browser)
	{
		System.out.println("The browser is: "+browser);
		if(browser.equals("chrome")) {
			//driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}else if (driver.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new FirefoxDriver());
		}else {
			System.out.println("Select correct value "+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}

