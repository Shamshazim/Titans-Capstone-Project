package step.definition;


import org.junit.Assert;
import org.openqa.selenium.support.FindBy;


import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePagePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base {
	
	HomePagePageObject homePge = new HomePagePageObject ();
	
	@Given("User is on Retail website to check currency value")
	public void user_is_on_retail_website_to_verify_currency_change() throws InterruptedException {
	 Assert.assertTrue(homePge.valadateUserIsOnRetailWebsite());
	 Thread.sleep(1000);
	    logger.info("user is on the retail website");
	
	}
	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
	    homePge.clickOnCurrencyDropDownButton();
	    logger.info("user clicked on currency drop down");
	   Thread.sleep(100);
	   
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
	   homePge.clickOnEruOption();
	   logger.info("user choose eru option");
	   Thread.sleep(100);
	
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws InterruptedException  {
	    Assert.assertTrue(homePge.valadateCurrencyIsChangedToEru());
	    logger.info("User verified the currenty is updated to ERU");
	    Thread.sleep(100);
	    WebDriverUtility.takeScreenShot();
	    
	  
	}
	
	// Shoping cart valadation methods starts here:
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
	    homePge.clickOnShopingCart();
	   logger.info("user clicked on shoping cart");
	   Thread.sleep(100);
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws InterruptedException {
	    Assert.assertTrue(homePge.valadateShopingCartIsEmpty());
	    logger.info("user valadated that shopig cart is empty");
	    Thread.sleep(100);
	    WebDriverUtility.takeScreenShot();
	}


	
}
