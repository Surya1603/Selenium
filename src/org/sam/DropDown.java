package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Surya\\eclipse-workspace\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//a[text()='Create new account']"));
		f.click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		Thread.sleep(3000);
		s.selectByValue("16");
		Thread.sleep(3000);
		WebElement mon = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1 = new Select(mon);
		s1.selectByVisibleText("Mar");
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(3000);
		Select s2 = new Select(yr);
		s2.selectByIndex(2);
	}

}