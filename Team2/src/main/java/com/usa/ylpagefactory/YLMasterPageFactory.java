package com.usa.ylpagefactory;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.ylbase.YLsuperclass;

public class YLMasterPageFactory extends YLsuperclass {
	

	public YLMasterPageFactory() {
		PageFactory.initElements(driver, this);

	}
	//loginBTN
	@FindBy(xpath = "//a[@class='login']")
	private WebElement clickBtn;
	public WebElement clickOnSignBtn() {
		return clickBtn;
	}
	
	//email
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailName;
	public WebElement getemailName() {
		return emailName;
	}
	
	//password
	@FindBy(id = "passwd")
	private WebElement passWord;
	public WebElement getPassWord() {
		return passWord;
	}
	
	//submit BTN
	@FindBy(id = "SubmitLogin")
	WebElement SubmitlogIn;
	public void submitlogIn() {
		SubmitlogIn.click();

	}

	// verify title
	public String titleVerify() {
		return driver.getTitle();

		/*
		 * String myTitle= driver.getTitle(); System.out.println("This is my title" +
		 * myTitle); String expected_title="My account - My Store";
		 * Assert.assertEquals(myTitle, expected_title);
		 * System.out.println("Test completed");
		 */
	}
	//dress BTN
	@FindBy(xpath = "(//*[@title='Dresses'])[2]")
	private WebElement dressBTN;
	public WebElement getDressBTN() {
		return dressBTN;
	}
	
	
		//all dress price printout
	public void printprice() {
		List <WebElement> pricelist= driver.findElements(By.xpath("//*[@class='price product-price']"));
		System.out.println("Total items showed up"+ " "+ pricelist.size());
		for(int i =0; i<pricelist.size();i++) {
			System.out.println("The List of pirces are"+ " "+ pricelist.get(i).getText());
		}
	}
	
	//second price printout
	public void secondItem() {
		List<WebElement> secondItems = driver.findElements(By.xpath("//*[@class='price product-price']"));
		for (int m = 0; m < secondItems.size(); m++) {
			if (m > 2) {
				System.out.println("second item price is:" + "" + secondItems.get(m).getText());
				secondItems.get(m);
				break;

			}
		}
	}
	//second dress click
	public void addSecondItem() {
		List<WebElement> secondItems = driver.findElements(By.xpath("//*[@class='price product-price']"));
		for (int j = 0; j < secondItems.size(); j++) {
			if (j > 2) {
				secondItems.get(j).click();
				break;
			}}}
	
	//Proceed to checkout
	@FindBy(xpath="//*[@class='btn btn-default button button-medium']/span")
	private WebElement proceedeTocheckOut;
	public WebElement proceedBTN() {
		return proceedeTocheckOut;
	}
	

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[3]")
	private WebElement SecondDress;
	public void getSecondDress() {
		SecondDress.click();
	}

	@FindBy(xpath = "//p[@id='add_to_cart']/button/span")
	private WebElement QuickViewAddcart;
	public void getQuickViewAddcart() {
		QuickViewAddcart.click();

	}
	
	//add to cart btn
	@FindBy(xpath = "(//button[@type='submit'])[3]/span")
	private WebElement addTocart;
	public void getAddTocart() {
		addTocart.click();

	}
	//total shipping price
	@FindBy(id="total_shipping")
	private WebElement shipping;
	public  WebElement totalShipping() {
		return shipping;
		
	}
	//total dress price
	@FindBy(id="total_price_without_tax")
	private WebElement dressPrice;
	public WebElement TotalDressPrice() {
		return dressPrice;
		}
	//logout btn
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logoutBTN;
	public WebElement getLogOutBTN() {
		return logoutBTN;
	
	}
	
	public void closed() {
		driver.close();
	}
	
	
}
