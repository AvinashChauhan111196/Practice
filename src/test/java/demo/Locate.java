package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locate {

	WebDriver driver = new ChromeDriver();
	
	
	public void button() {
		
		driver.findElement(By.xpath("")).click();
	}
	
	
	public void radioButton() {
		
		driver.findElement(By.xpath("")).click();
	}
	
	
	public void input() {
		
		driver.findElement(By.xpath(""));
	}
	
	
	public void dropDown() {
		
		Select s = new Select(driver.findElement(By.xpath("")));
		s.selectByIndex(0);
		s.selectByValue("");
		s.selectByVisibleText("");
	}
	
	
	public void checkboxSelected() {
		
		boolean b = driver.findElement(By.xpath("")).isSelected();
		boolean c = driver.equals("");
		String s = driver.getCurrentUrl();
	}
	
	
	public void checkboxDisplayed() {
		
		driver.findElement(By.xpath("")).isDisplayed();
		
		driver.navigate(); 
		driver.findElement(By.cssSelector(null));
	}
}
