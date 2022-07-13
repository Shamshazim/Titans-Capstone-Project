package step.definition;



import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopNoteBook = new LaptopNoteBooksPageObject();
	
	
	@Given ("User is on Retail website to purchase laptop")
	public void user_is_on_Retail_Website () throws InterruptedException {
		Assert.assertTrue(laptopNoteBook.valadateUserIsInRetailDeskTop());
		logger.info("user is in retail website");
		Thread.sleep(1000);
	}
    @When ("User click on Laptop &NoteBook tab")
    public void user_click_on_Laptop_and_notebook_tab () throws InterruptedException {
    	laptopNoteBook.clickOnLaptopAndNoteBooksTab();
    	logger.info("user clicked on Laptop and NoteBook Tab");
    	Thread.sleep(1000);
    	WebDriverUtility.takeScreenShot();
    }
    @And ("User click on Show all Laptop &NoteBook option")
    public void user_click_on_show_all_laptop_and_notebook_option () {
    	laptopNoteBook.userClickOnShowAllLaptopsAndNotbooks();
    	logger.info("user clicked on show all laptops and notebooks tab");
    }
    @And ("User click on MacBook item")
    public void user_click_on_MacBook_item () throws InterruptedException {
    	laptopNoteBook.userClickOnMacBook();
    	logger.info("user clicked on MacBook");
    	Thread.sleep(1000);
    }
    @And ("User click add to Cart button")
    public void user_click_add_to_Cart_Button () throws InterruptedException {
    	laptopNoteBook.userClickAddMacBookToTheCart();
    	logger.info("user clicked on add MacBook to the cart");
    	Thread.sleep(10000);
    }
    @Then ("User should see a message ‘Success: You have added MacBook to your shopping cart!")
    public void userShouldSeeASuccessMessageItemIsAddedToTheCart () throws InterruptedException {
       	Assert.assertTrue(laptopNoteBook.valadateMacBookIsSuccesfullyAddedToTheCart());
    	logger.info("MacBook is successfully added to the cart");
    	Thread.sleep(1000);
    }
    @And ("User should see one item added to the cart")
    public void userShouldSee1ItemIsInTheCart () {
    	Assert.assertTrue(laptopNoteBook.valadateItemIsInTheCart());
    	logger.info("user sees item is in the cart");
    }
    @And ("User click on cart option")
    public void user_click_on_cart_option () throws InterruptedException {
    	laptopNoteBook.userClickOnTheCart();
    	logger.info("user clicked on the cart");
    	Thread.sleep(1000);
    }
    @And ("user click on red X button to remove the item from cart")
    public void user_click_on_red_X_button_to_remove_the_item_from_cart () throws InterruptedException {
    	laptopNoteBook.clickRemoveItemFromTheCart();
    	logger.info("user removed the item from the cart");
    	Thread.sleep(1000);
    }
    @Then ("item should be removed and cart should show zero item")
    public void item_shoul_be_removed_and_cart_should_show_0_item () throws InterruptedException {
    	Assert.assertTrue(laptopNoteBook.valadateItemIsSuccessfullyRemovedFromTheCart());
    	logger.info("item is successfully removed from the cart");
    	Thread.sleep(1000);
    	WebDriverUtility.takeScreenShot();
    }
    
    //Product Comparison methods starts here:
    
    @When("User click on product comparison icon on MacBook")
    public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
        laptopNoteBook.clickOnMacBookComparisonButton();
        logger.info("user added macbook into comparison chart");
    }
    @When("User click on product comparison icon on MacBook Air")
    public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
        laptopNoteBook.clickOnMacAirComparisonButton();
        logger.info("user added macAir into the camparison chart");
    }
    @Then("User should see a message Success: You have added MacBook Air to your product comparison!")
    public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
        Assert.assertTrue(laptopNoteBook.valadateSuccessMessageItemAddedOnTheComparisonChart());
        logger.info("item successfully added into the comparison chart message is displayed");
    }
    @Then("User click on Product comparison link")
    public void user_click_on_product_comparison_link() throws InterruptedException {
        laptopNoteBook.clickOnProductComparsionLink();
        logger.info("user clicked on comparison link");
    }
    @Then("User should see Product Comparison Chart")
    public void user_should_see_product_comparison_chart() {
        Assert.assertTrue(laptopNoteBook.valadateComparisonChart());
        logger.info("user successfully see the comparison chart");
        WebDriverUtility.takeScreenShot();
    }
    
    //Adding to wishlist methods starts here:
    @When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
    public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
        laptopNoteBook.clickOnAddSonyVioToWishListHeartButton();
        logger.info("user clicked to add sony vio laptop into wish list");
    }
    @Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list.")
    public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
        Assert.assertTrue(laptopNoteBook.valadateMessageAlertToUserToLoginOrCreatAccount());
        logger.info("user successfully see the message asking user to create account or login into an existing account");
        WebDriverUtility.takeScreenShot();
    }
    
    
    //MacBook Pro Methods Starts Here:
    
    @When("User click on ‘MacBook Pro’ item")
    public void user_click_on_mac_book_pro_item() {
        laptopNoteBook.clickOnMacBookPro();
        logger.info("user clicked on macBook Pro");
    }
    
    @Then("User should see {string} price tag is present on UI")
    public void user_should_see_price_tag_is_present_on_ui(String $2000) {
    
    //@Then("User should see '$2000.00' price tag is present on UI")
   // public void user_should_see_$_price_tag_is_present_on_ui() {
        Assert.assertTrue(laptopNoteBook.valadateMacBookPrice());
        logger.info("user varified that the price is $2000.00");
        WebDriverUtility.takeScreenShot();
    }



	

}
