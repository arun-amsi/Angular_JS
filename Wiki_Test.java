package com.arun.selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Wiki_Test{
	
	public static void main1(String a[]){
		System.out.println("Hello");
		System.setProperty("webdriver.ie.driver", "C:\\software\\selinium\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.wikipedia.org");
		driver.findElement(By.linkText("English")).click();		
		driver.findElement(By.id("searchInput")).sendKeys("jallikattu");
		driver.quit();
	}
	
	public static void main2(String a[]) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\software\\selinium\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.wikipedia.org");
		driver.get("http://vpriceuat1.verizon.com/");
		Thread.sleep(1000);
		WebElement linkDriver ; 
		linkDriver= driver.findElement(By.linkText("English"));		
		linkDriver.click();
		Thread.sleep(1000);
		WebElement searchIput ;
		searchIput = driver.findElement(By.id("searchInput"));
		searchIput.sendKeys("Jallikattu");
		searchIput.submit();
		driver.quit();
	}
	
	public static void main(String a[]) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\software\\selinium\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.wikipedia.org");
		driver.get("http://vpriceuat1.verizon.com/");
		Thread.sleep(1000);
		
		WebElement userId ; 
		userId= driver.findElement(By.id("USERID"));	
		userId.sendKeys("v523338");
		Thread.sleep(1000);
		
		WebElement searchIput ;
		searchIput = driver.findElement(By.id("PASSWORD"));
		searchIput.sendKeys("3edc#EDC");
		
		//String dropdown = driver.findElement(By.partialLinkText("Sign"));
		//System.out.println("Element Name :"+dropdown);
		
		WebElement submitBtn ; 
		submitBtn= driver.findElement(By.partialLinkText("Sign"));		
		submitBtn.click();
		
		Alert prompt = driver.switchTo().alert();
	    String message = prompt.getText();
	    System.out.println("Prompt pop up message :- " + message);
	    prompt.accept();
	    
	    Thread.sleep(3000);
	    /*Actions actions = new Actions(driver);
	    WebElement mainMenu = driver.findElement(By.partialLinkText("Deal"));
	    actions.moveToElement(mainMenu);
	    
	    Thread.sleep(3000);
	    Actions subActions = new Actions(driver);
	    WebElement subMenu = driver.findElement(By.linkText("Scenario Analysis"));
	    subActions.moveToElement(subMenu);
	    subActions.click();*/
	    
	    driver.findElement(By.xpath(".//[contains(text(),'Deal Desk')]")).click();
	    //
	    /*Actions action = new Actions(driver);
	    WebElement mainMenu = driver.findElement(By.linkText("Deal Desk"));
	    action.moveToElement(mainMenu).moveToElement(driver.findElement(By.linkText("Scenario Analysis"))).click().build().perform();*/
	    
	    
		//driver.quit();
	}
}
