package org.sam;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		WebElement loc = driver.findElement(By.xpath("//img[@alt='CHEN']"));
		loc.click();
		Thread.sleep(3000);
		WebElement find = driver.findElement(By.xpath("//div[text()='Kannai Nambaathe']"));
		find.click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]"));
		element.click();
		Thread.sleep(6000);
		WebElement show = driver.findElement(By.xpath("//a[@data-session-id='19629']"));
		show.click();
		Thread.sleep(3000);
		WebElement acc = driver.findElement(By.id("btnPopupAccept"));
		acc.click();
		Thread.sleep(3000);
		WebElement seat = driver.findElement(By.xpath("//li[@id='pop_1']"));
		seat.click();
		Thread.sleep(3000);
		WebElement slt = driver.findElement(By.id("proceed-Qty"));
		slt.click();
		Thread.sleep(5000);
		WebElement seatNo = driver.findElement(By.xpath("(//a[@class='_available'])[38]"));
		seatNo.click();
		Thread.sleep(3000);
		WebElement pay = driver.findElement(By.id("btmcntbook"));
		pay.click();
	}

}
