package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
        WebElement find = driver.findElement(By.xpath("//button[@id='alertButton']"));
		find.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		WebElement ele = driver.findElement(By.id("timerAlertButton"));
		ele.click();
		driver.switchTo().alert().accept();
		
		WebElement element = driver.findElement(By.id("confirmButton"));
		element.click();
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("ManInBlack");
		driver.switchTo().alert().accept();
		
		
		
	}

}
