package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.GetTitle;

public class WindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement fit = driver.findElement(By.xpath("//a[text()='Health & Wellness']"));
		a.clickAndHold(fit).perform();
		WebElement scale = driver.findElement(By.xpath("//a[text()='Weighing Scales']"));
		scale.click();
		Set<String> window = driver.getWindowHandles();
		for (String handle: window) {
			String title = driver.switchTo().window(handle).getTitle();
			System.out.println(title);
		}
		driver.close();
		
	}

}
