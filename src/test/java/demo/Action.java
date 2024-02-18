package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	WebDriver driver = new ChromeDriver();
	
	public void act() {
		
		Actions  a = new Actions(driver);
		
		a.doubleClick(driver.findElement(By.xpath(""))).perform();
		a.click(driver.findElement(By.xpath("")));
		a.sendKeys("abcd");
		a.sendKeys(Keys.ESCAPE);
		a.moveToElement(driver.findElement(By.xpath(""))).sendKeys("Test");
		a.clickAndHold();
		a.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		a.keyDown("abc");
		a.keyUp("acb");
		a.contextClick();
		a.moveByOffset(2, 3);
		a.build();
		a.perform();
		
	}
	
	
}
