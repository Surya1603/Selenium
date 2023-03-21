package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Value {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        WebElement f = driver.findElement(By.name("q"));
        f.sendKeys("imdb");
        f.submit();
        WebElement b = driver.findElement(By.xpath("//h3[text()='IMDb: Ratings, Reviews, and Where to Watch the Best Movies ...']"));
		b.click();
		WebElement c = driver.findElement(By.xpath("//input[@name='q']"));
		c.sendKeys("Varisu");
		WebElement d = driver.findElement(By.id("iconContext-magnify"));
		d.click();
		WebElement a = driver.findElement(By.xpath("//a[text()='Varisu']"));
		a.click();
		WebElement e = driver.findElement(By.xpath("(//span[@class='sc-e457ee34-1 gvYTvP'])[1]"));
		String text = e.getText();
		System.out.println("Rating is ;" + text);
		
	}

}
