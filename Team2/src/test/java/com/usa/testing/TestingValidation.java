
package com.usa.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestingValidation {
	
	@Test
	public void loginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("akharabdul@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("2w2w2w2w");
		driver.findElement(By.id("SubmitLogin")).click();
		//boolean logoPresent = driver.findElement(By.xpath("//img[@alt='My Store']")).isDisplayed();
		//Assert.assertTrue(logoPresent, "YourLoo");
		Thread.sleep(3000);
		
		String myTitle= driver.getTitle();
		System.out.println("this title "+ myTitle);
		String expected_title= "My account - My Store";
		Assert.assertEquals(myTitle, expected_title);
		System.out.println("Test completed");
		//String expected title = "Login - My Store"
		
		//dress btn
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		
		//printing all prices
		List <WebElement> pricelist= driver.findElements(By.xpath("//*[@class='price product-price']"));
		for(int i =0; i<pricelist.size();i++) {
			System.out.println(pricelist.get(i).getText());
		}
		    //scroll down
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		 //  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		/*List<WebElement> listElement = driver.findElements(By.className("price product-price"));
		for(int i =0;i<listElement.size();i++) {
		 String elementText = listElement.get(i).getText(); 
		 System.out.println(elementText); }*/
		
		//under link is for click on second dress
		//driver.findElement(By.xpath("(//div[@class='left-block'])[2]")).click();
		
		
		//second dress click
		List<WebElement> secondItems = driver.findElements(By.xpath("//*[@class='price product-price']"));
		for(int m=0;m<secondItems.size(); m++) {
			if(m>2) {
				System.out.println("second item price is:" + "" + secondItems.get(m).getText());
				secondItems.get(m).click();
				break;}}
				
		driver.findElement(By.xpath("//*[@class='btn btn-default button button-medium']")).click();
	//driver.findElement(By.xpath("//*[contains (text(), 'Proceed to checkout')]")).click();
		driver.findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
		

		//driver.findElement(By.xpath("(//*[span='Add to cart'])[6]")).click();
		
		//System.out.println("***********************************");
		
	     //   List<WebElement> list = driver.findElements(By.cssSelector(".product_list.grid.row li"));
	      //  String text = list.get(0).getText();

	      //  System.out.println("this is second dress price " + ("\n")+text);
	        
		//System.out.println("*****************************************");
		
		
		/*driver.findElement(By.xpath("(//*[@title='Dresses'])[2]")).click();
		Thread.sleep(3000);
		List<WebElement> listOfElements= driver.findElements(By.xpath("//ul[@class='tree dynamized']/li"));
		//System.out.println(listOfElements);*/
		
		//for (WebElement webElement : listOfElements) {
			
		//}
		 
	    
		
		
	}
	

}
