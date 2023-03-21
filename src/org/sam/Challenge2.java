package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.in/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.flipkart.com/search?q=samsung%20mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		String t = driver.getTitle();
		System.out.println("Current title is =" + t);
		
		String c = driver.getCurrentUrl();
		System.out.println("Current url =" + c);
		
		driver.close();
		
		driver.quit();
		
	}

}
