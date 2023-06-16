package org.Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDiel {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("mens shoe");
	driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
	driver.findElement(By.id("6917529666780734034")).click();
	Set<String> allwins = driver.getWindowHandles();
	List<String> allID = new ArrayList<String>();
	driver.switchTo().window(allID.get(1));
	JavascriptExecutor js = (JavascriptExecutor)driver;

	
}
}