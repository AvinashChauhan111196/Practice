package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ChromeFirefox {

	WebDriver driver = new ChromeDriver();
	
	ChromeOptions op = new ChromeOptions();
	FirefoxOptions fx = new FirefoxOptions();
	
	public void chrome() {
		
		op.addArguments("--incognito");
		op.addArguments("--start-maximized");
		op.addArguments("--start-fullscreen");
		op.addArguments("--disable-popup-blocking");
		op.getBrowserVersion();
		
		
	}
	
	public void firefox( ) {
		
		fx.addArguments("--incognito");
		fx.addArguments("--start-maximized");
		fx.addArguments("--start-fullscreen");
		fx.addArguments("--disable-popup-blocking");
		fx.getBrowserVersion();
		
	}
	
}
