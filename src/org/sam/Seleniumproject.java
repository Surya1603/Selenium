package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumproject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//get
		driver.get("https://www.amazon.in/");
		//manage
		driver.manage().window().maximize();
		//get title
		String t = driver.getTitle();
		System.out.println("Current page title " + t);
		//get url
		String c = driver.getCurrentUrl();
		System.out.println("Current url" +c);
		//close
		driver.close();
		//quit
		driver.quit();
	}

}
