package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame(0);
//		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
//		txt.sendKeys("Argon");
//		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		WebElement multi = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multi.click();
		Thread.sleep(2000);
		WebElement nested = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(nested);
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		Thread.sleep(2000);
		WebElement send = driver.findElement(By.xpath("//input[@type='text']"));
		send.sendKeys("Krypton");
	}

}
