package demo;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAndFrame {

	WebDriver driver = new ChromeDriver();
	
	 public void window(){		 
		 
	        // Open new child window within the main window
	        driver.findElement(By.id("windowButton")).click();

	        //Get handles of the windows
	        String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();

	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	                WebElement text = driver.findElement(By.id("sampleHeading"));
	                System.out.println("Heading of child window is " + text.getText());
	            }
	        }
		
	    }
	 
	 public void windowHandle() {
		 
		 String mainWindowHandle = driver.getWindowHandle();
		 driver.switchTo().window(mainWindowHandle);
	 }
	 
	 public void iframe() {
		 
		 driver.switchTo().frame(1);
		 driver.switchTo().frame("");
		 driver.switchTo().frame(driver.findElement(By.xpath("")));
		 
	 }
}
