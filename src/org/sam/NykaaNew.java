package org.sam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaNew {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		WebElement app = driver.findElement(By.xpath("//a[text()='appliances']"));
		Actions a = new Actions(driver);
		a.clickAndHold(app).perform();
		WebElement personal = driver.findElement(By.xpath("//a[text()=' Trimmers for Men']"));
		personal.click();
		Set<String> handles = driver.getWindowHandles();
		for (String ne : handles) {
			driver.switchTo().window(ne);
		}
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement find = driver.findElement(By.xpath("//div[text()='Philips BT1232/15 Skin-friendly Beard Trimmer - Durapower Te...']"));
		find.click();
		Set<String> handles2 = driver.getWindowHandles();
		for (String str : handles2) {
			driver.switchTo().window(str);
		}
		WebElement ad = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		ad.click();
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		cart.click();
		Thread.sleep(3000);
		WebElement fram = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		Thread.sleep(3000);
		driver.switchTo().frame(fram);
		Thread.sleep(3000);
		WebElement pro = driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d7']"));
		pro.click();
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]"));
		log.click();
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.xpath("(//input[@class='input-element  '])[1]"));
		pin.sendKeys("624601");
		Thread.sleep(2000);
		WebElement flat = driver.findElement(By.xpath("(//input[@class='input-element  '])[4]"));
		flat.sendKeys("45/1,RMK Nagar,Palani");
		Thread.sleep(2000);
		WebElement road = driver.findElement(By.xpath("//textarea[@class='input-element input-area ']"));
		road.sendKeys("GandiRoad,Palani");
		Thread.sleep(2000);
		WebElement nam = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		nam.sendKeys("Surya");
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		phone.sendKeys("9788942280");
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		mail.sendKeys("surya003@gmail.com");
		Thread.sleep(2000);
		WebElement order = driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']"));
		order.click();
	}

}
