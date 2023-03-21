package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	private void name() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		user.sendKeys("abc003@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123003syq");
		WebElement clk = driver.findElement(By.xpath("//button[text()='Log in']"));
		clk.click();
		
	}

}
