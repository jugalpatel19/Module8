package com.fm;
import org.openqa.selenium.By;
/*
 W.a.maven program to create Junit with webdriver Program
 */
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriver {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.close();
	}


}
