package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("qwe12@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12543qw");
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	}

}
