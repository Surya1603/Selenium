package org.sam;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement drop = driver.findElement(By.xpath("//select[@id='cars']"));
        Select s = new Select(drop);
        s.selectByIndex(0);
        s.selectByValue("opel");
        s.selectByVisibleText("Audi");
        boolean mul = s.isMultiple();
        System.out.println(mul);
        List<WebElement> ele = s.getAllSelectedOptions();
        for (WebElement web : ele) {
        	System.out.println(web.getText());
			
		}
        Thread.sleep(5000);
        s.deselectAll();
        
        
        TakesScreenshot tk = (TakesScreenshot)driver;
        File shot = tk.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Surya\\eclipse-workspace\\Selenium\\ScreenShot\\demo.png");
        FileUtils.copyFile(shot, des);
        
	}

}
