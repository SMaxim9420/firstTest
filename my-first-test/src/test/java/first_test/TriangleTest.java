package first_test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Platform;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

 
	@TestInstance(Lifecycle.PER_CLASS)
	public class TriangleTest {
	private WebDriver driver;
	String baseURL, nodeURL1, nodeURL2;
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	
	 
	@BeforeAll
	public void setUp() throws MalformedURLException {
	    baseURL="https://www.calculator.net/triangle-calculator.html";
	    nodeURL1="http://192.168.43.15:5555/wd/hub";
	    nodeURL2="http://192.168.43.15:5556/wd/hub";
	}
	@AfterEach
	public void tearDown() {
		driver.close();
	}
	 
	  
	  @Test
	  public void test1() throws MalformedURLException {
		  
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  {
		      WebElement element = driver.findElement(By.cssSelector(".clearbtn"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		  }
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		  }
		  driver.findElement(By.name("vy")).click();
		  driver.findElement(By.name("vy")).sendKeys("6");
		  driver.findElement(By.name("vx")).click();
		  driver.findElement(By.name("vx")).sendKeys("6");
		  driver.findElement(By.name("vz")).click();
		  driver.findElement(By.name("vz")).sendKeys("6");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector(".h2result")).getText(),("Result"));
	  	  }
	  
	  
	  @Test
	  public void test2() throws MalformedURLException {
		  	
		  System.out.println("Executing on CHROME");
		  DesiredCapabilities cap = new DesiredCapabilities();   
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		  driver = new RemoteWebDriver(new URL(nodeURL2), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);
		  
		 
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  driver.findElement(By.name("vy")).click();
		  driver.findElement(By.name("vy")).sendKeys("6");
		  driver.findElement(By.name("vx")).click();
		  driver.findElement(By.name("vx")).sendKeys("6");
		  driver.findElement(By.name("vz")).click();
		  driver.findElement(By.name("vz")).sendKeys("9");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),("Obtuse Isosceles Triangle"));
		  }
	  
	
	  @Test
	  public void test3() throws MalformedURLException {
		 
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);
		 
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  {
		      WebElement element = driver.findElement(By.cssSelector(".clearbtn"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		  }
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		  }
		  driver.findElement(By.name("vx")).click();
		  driver.findElement(By.name("vx")).sendKeys("6");
		  driver.findElement(By.name("vz")).click();
		  driver.findElement(By.name("vz")).sendKeys("9");
		  driver.findElement(By.name("va")).click();
		  driver.findElement(By.name("va")).sendKeys("90");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector("#content > div:nth-child(7)")).getText(),("Area = 27"));
	  	  }
	  
	  
	  @Test
	  public void test4() throws MalformedURLException {
		  
		  System.out.println("Executing on CHROME");
		  DesiredCapabilities cap = new DesiredCapabilities();   
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		  driver = new RemoteWebDriver(new URL(nodeURL2), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);
		  
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  driver.findElement(By.name("vy")).click();
		  driver.findElement(By.name("vy")).sendKeys("6");
		  driver.findElement(By.name("va")).click();
		  driver.findElement(By.name("va")).sendKeys("70");
		  driver.findElement(By.name("vc")).click();
		  driver.findElement(By.name("vc")).sendKeys("60");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),("Acute Scalene Triangle")); 
	  	  }
	  
	  
	  @Test
	  public void test5() throws MalformedURLException {
		  
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);
		  
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  driver.findElement(By.name("vy")).click();
		  driver.findElement(By.name("vy")).sendKeys("6");
		  driver.findElement(By.name("vx")).click();
		  driver.findElement(By.name("vx")).sendKeys("6");
		  driver.findElement(By.name("vc")).click();
		  driver.findElement(By.name("vc")).sendKeys("120");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector("#content > div:nth-child(8)")).getText(),("Perimeter p = 22.3923"));
	      }
	  
	  
	  @Test
	  public void test6() throws MalformedURLException {
		  
		  System.out.println("Executing on CHROME");
		  DesiredCapabilities cap = new DesiredCapabilities();   
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		  driver = new RemoteWebDriver(new URL(nodeURL2), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);
		  
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  driver.findElement(By.name("vy")).click();
		  driver.findElement(By.name("vy")).sendKeys("6.0");
		  driver.findElement(By.name("vx")).click();
		  driver.findElement(By.name("vx")).sendKeys("6.0");
		  driver.findElement(By.name("vz")).click();
		  driver.findElement(By.name("vz")).sendKeys("9");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),("Obtuse Isosceles Triangle"));
	      }
	  
	  
	  @Test
	  public void test7() throws MalformedURLException {
		  
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);
		  
		  driver.manage().window().setSize(new Dimension(1366, 688));
		  {
		      WebElement element = driver.findElement(By.cssSelector(".clearbtn"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		  }
		  driver.findElement(By.cssSelector(".clearbtn")).click();
		  {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		  }
		  driver.findElement(By.name("vy")).click();
		  driver.findElement(By.name("vy")).sendKeys("6000000");
		  driver.findElement(By.name("vx")).click();
		  driver.findElement(By.name("vx")).sendKeys("6000000");
		  driver.findElement(By.name("vz")).click();
		  driver.findElement(By.name("vz")).sendKeys("6000000");
		  driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
		  Assert.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),("Equilateral Triangle"));
	      }
	  
	  
	  @Test
	  public void testN8() throws MalformedURLException {
		  
		  System.out.println("Executing on CHROME");
		  DesiredCapabilities cap = new DesiredCapabilities();   
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		  driver = new RemoteWebDriver(new URL(nodeURL2), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);  
		  
	      driver.manage().window().setSize(new Dimension(1366, 688));
	      driver.findElement(By.cssSelector(".clearbtn")).click();
	      driver.findElement(By.name("vy")).click();
	      driver.findElement(By.name("vy")).sendKeys("4");
	      driver.findElement(By.name("vx")).click();
	      driver.findElement(By.name("vx")).sendKeys("10");
	      driver.findElement(By.name("vz")).click();
	      driver.findElement(By.name("vz")).sendKeys("6");
	      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	      Assert.assertEquals(driver.findElement(By.cssSelector("font")).getText(),("The sum of two sides must be larger than the third."));
	  	  }
	  
	 
	  @Test
	  public void testN9() throws MalformedURLException {
		  
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);  
		  
	      driver.manage().window().setSize(new Dimension(1366, 688));
	      driver.findElement(By.cssSelector(".clearbtn")).click();
	      driver.findElement(By.name("vy")).click();
	      driver.findElement(By.name("vy")).sendKeys("6");
	      driver.findElement(By.name("vx")).click();
	      driver.findElement(By.name("vx")).sendKeys("9");
	      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	      Assert.assertEquals(driver.findElement(By.cssSelector("font")).getText(),("Please provide 3 positive values, including at least one side."));
	      }
	  
	  
	  @Test
	  public void testN10() throws MalformedURLException {
		  
		  System.out.println("Executing on CHROME");
		  DesiredCapabilities cap = new DesiredCapabilities();   
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		  driver = new RemoteWebDriver(new URL(nodeURL2), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL); 
		  
	      driver.manage().window().setSize(new Dimension(1366, 688));
	      driver.findElement(By.cssSelector(".clearbtn")).click();
	      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	      Assert.assertEquals(driver.findElement(By.cssSelector("font")).getText(),("Please provide 3 positive values, including at least one side."));
	      }
	  
	  
	  @Test
	  public void testN11() throws MalformedURLException {
		  
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);
		  
	    
	      driver.manage().window().setSize(new Dimension(1366, 688));
	      driver.findElement(By.cssSelector(".clearbtn")).click();
	      driver.findElement(By.name("vy")).click();
	      driver.findElement(By.name("vy")).sendKeys("a");
	      driver.findElement(By.name("vx")).click();
	      driver.findElement(By.name("vx")).sendKeys("b");
	      driver.findElement(By.name("vz")).click();
	      driver.findElement(By.name("vz")).sendKeys("c");
	      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	      Assert.assertEquals(driver.findElement(By.cssSelector("font")).getText(),("Please provide 3 positive values, including at least one side."));
	  	  }
	  
	  
	  @Test
	  public void testN12() throws MalformedURLException {
		  
		  System.out.println("Executing on CHROME");
		  DesiredCapabilities cap = new DesiredCapabilities();   
		  cap.setBrowserName("chrome");
		  cap.setPlatform(Platform.WINDOWS);
		     
		  driver = new RemoteWebDriver(new URL(nodeURL2), cap);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
		  driver.get(baseURL);
		  
	      driver.manage().window().setSize(new Dimension(1366, 688));
	      driver.findElement(By.cssSelector(".clearbtn")).click();
	      driver.findElement(By.name("vy")).click();
	      driver.findElement(By.name("vy")).sendKeys("6a");
	      driver.findElement(By.name("vx")).click();
	      driver.findElement(By.name("vx")).click();
	      {
	      WebElement element = driver.findElement(By.name("vx"));
	      Actions builder = new Actions(driver);
	      builder.doubleClick(element).perform();
	      }
	      driver.findElement(By.name("vx")).sendKeys("9");
	      driver.findElement(By.name("vz")).click();
	      driver.findElement(By.name("vz")).sendKeys("9");
	      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	      Assert.assertEquals(driver.findElement(By.cssSelector("font")).getText(),("Please provide 3 positive values, including at least one side."));
	      }
	  
	  
	  @Test
	  public void testN13() throws MalformedURLException {
		  
		  System.out.println("Executing on FireFox");
		  DesiredCapabilities capability = new DesiredCapabilities();   
		  capability.setBrowserName("firefox");
		  capability.setPlatform(Platform.WINDOWS);
		  driver=new RemoteWebDriver(new URL(nodeURL1),capability);
		  driver.get(baseURL);
		  
	      driver.manage().window().setSize(new Dimension(1366, 688));
	      driver.findElement(By.cssSelector(".clearbtn")).click();
	      driver.findElement(By.name("vy")).click();
	      driver.findElement(By.name("vy")).sendKeys("-3");
	      driver.findElement(By.name("vx")).click();
	      driver.findElement(By.name("vx")).sendKeys("-3");
	      driver.findElement(By.name("vz")).click();
	      driver.findElement(By.name("vz")).sendKeys("-3");
	      driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
	      driver.findElement(By.cssSelector("p:nth-child(4)")).click();
	      Assert.assertEquals(driver.findElement(By.cssSelector("font")).getText(),("Please provide 3 positive values, including at least one side."));
	      }
	 }

	
	
