package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {


    WebDriver driver = new ChromeDriver();

    public void alert(){
        Alert a = driver.switchTo().alert();
        a.dismiss();
        a.accept();
        a.sendKeys("");
        String txt = a.getText();
    }
    
}
