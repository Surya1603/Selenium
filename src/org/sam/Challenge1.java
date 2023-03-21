package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.in/");
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/mail/");
		
		
		String t = driver.getTitle();
		System.out.println("Current Title is =" + t);
		
		String c = driver.getCurrentUrl();
		System.out.println("Current url =" + c);
		
		String page = driver.getPageSource();
		System.out.println("PageSource =" +page);
		
		driver.close();
		
		driver.quit();
	
	}

}
