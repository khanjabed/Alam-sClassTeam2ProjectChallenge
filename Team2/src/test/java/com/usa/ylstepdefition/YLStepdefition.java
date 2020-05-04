package com.usa.ylstepdefition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.usa.ylbase.YLsuperclass;
import com.usa.ylpagefactory.YLMasterPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YLStepdefition extends YLsuperclass {

	YLMasterPageFactory mp;

	@Given("^Customer can open any browser$")
	public void customer_can_open_any_browser() {
		initialization();
		mp = PageFactory.initElements(driver, YLMasterPageFactory.class);

	}

	@Given("^Navigate to url \"([^\"]*)\" and click onto signin button$")
	public void navigate_to_url_and_click_onto_signin_button(String url) {
		logger.info("******** Opening URL*********");
		driver.get(url);
		mp.clickOnSignBtn().click();

	}

	@Given("^User can enter userName \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_can_enter_userName_and_password(String userName, String password) {
		logger.info("******** Providing login details*********");

		mp.getemailName().sendKeys(userName);
		mp.getPassWord().sendKeys(password);

	}

	@Given("^Click on Submit button$")
	public void click_on_Submit_button() {
		logger.info("******** Submit loginBtn *********");

		mp.submitlogIn();

	}

	@Given("^Verify Home page title$")
	public void verify_Home_page_title() {
		 String Actual = driver.getTitle();
		String expected = "My account - My Store";
		logger.info("******** Home page title passed *********");

		System.out.println("This is home page title: " + expected);
		 Assert.assertEquals(Actual, expected);
	}

	@Then("^user click on dress$")
	public void user_click_on_dress() {
		logger.info("******** Click Dress *********");

		mp.getDressBTN().click();

	}

	@Then("^user print all five items price on console$")
	public void user_print_all_five_items_price_on_console() {
		logger.info("******** Print all Item's price *********");

		mp.printprice();
	}

	@Then("^user select second item$")
	public void user_select_second_item() {
		logger.info("******** Select second Item *********");

		mp.secondItem();

	}

	@Then("^added to the cart$")
	public void added_to_the_cart() {
		logger.info("******** Item added to cart *********");

		mp.addSecondItem();

	}

	@When("^user proceede and verifies shipping and dress prices$")
	public void user_proceede_and_verifies_shipping_and_dress_prices() {
		logger.info("******** Proceed to checkout page *********");

		mp.proceedBTN().click();
		
	
		String expectedShipping= mp.totalShipping().getText();
		String expectedTotalPrice= mp.TotalDressPrice().getText();
		String actualShippingPrice= "$2.00";
		String actualTotalPrice = "$52.99";	
		System.out.println("This is shipping price: " + "" + expectedShipping);
		System.out.println("this is dress price: " + "" + expectedTotalPrice);
		if(expectedShipping.equalsIgnoreCase(actualShippingPrice)) {
			
			System.out.println("expected Shipping matched with Actual");
		}else {
			System.out.println("Expected shipping price did not match");
		}
		if(expectedTotalPrice.equalsIgnoreCase(actualTotalPrice)) {
			
			logger.info("******** Total price passed *********");
			System.out.println("Expected total price matched with actual");
		}else {
			logger.info("******** Totl price failed *********");

			System.out.println("expected total price did not match");
		}
		//Assert.assertEquals(mp.totalShipping(), expectedShipping);
		//Assert.assertEquals(mp.TotalDressPrice(), expectedTotalPrice);

	}

	@Then("^user close and quit$")
	public void user_close_and_quit() {
		logger.info("******** click on logout and Quit *********");

		mp.getLogOutBTN();
		mp.qiutdown();

	}

}
