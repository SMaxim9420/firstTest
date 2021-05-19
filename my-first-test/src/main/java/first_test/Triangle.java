package first_test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Triangle {
	public static void main(String[] args) throws Throwable{
        // TODO Auto-generated method stub
        WebDriver chromeDriver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
      chromeDriver.navigate().to(" https://www.calculator.net/triangle-calculator.html");
        String appTitle = chromeDriver.getTitle();
        System.out.println("Application title is :: "+appTitle);
        Thread.sleep(5000); 
        chromeDriver.quit();
    }
}