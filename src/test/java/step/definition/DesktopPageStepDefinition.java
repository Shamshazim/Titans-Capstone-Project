package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desktopPage = new DesktopPageObject ();
	
	@Given ("User is on Retail website")
	public void valadateUserIsOnDeskTopPage () {
		Assert.assertTrue(desktopPage.isUserIsOnDeskTopPage());
		logger.info("user is on desktop page");
		WebDriverUtility.takeScreenShot();
	}
	
	@When ("User click on Desktops tab")
	public void user_is_on_Retail_website() {
		desktopPage.clickOnDesktopTab();
		logger.info("user clicked on the desktops tab");		
	}
	@And ("User click on Show All desktops")
	public void user_click_on_show_all_desktops () {
		desktopPage.clickOnShowAllDesktopTab();
		logger.info("user click on show all desktop menue");
	}
	@Then ("User should see all items are present in Desktop page") 
	public void user_should_see_all_items_are_present_in_Desktop_page () {
		Assert.assertTrue(desktopPage.isDesktopItemAreDisplayed());
		logger.info("desktop items are present");
		WebDriverUtility.takeScreenShot();
	}
	
	@And ("User click ADD TO CART option on HP LP3065 item")
	public void user_click_ADD_TO_CART_option_on_HP_LP3065_item() {
		desktopPage.clickAddLaptopHpToTheCart();
		logger.info("user clicked on add to the cart button");
	}
    @And ("User select quantity 1 for laptop")
    public void user_select_quantity_1_laptop () {
    	desktopPage.clickOnSelectLaptopQuantity();
    	logger.info("user select 1 as the quantity for laptop");
    }
    @And ("User click add to Cart button for laptop")
    public void user_click_add_to_Cart_button_for_laptop () {
    	desktopPage.addToTheCart();
    	logger.info("user added laptop to the cart");
    }
    @Then ("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!")
    public void userShouldSeeASuccessMessage() {
    	Assert.assertTrue(desktopPage.valadateLaptapIsSuccessfullyAddedToTheCart());
    	logger.info("user saw the message item successfuly added to the cart");
    	WebDriverUtility.takeScreenShot();
    	
    }
    
    // Camera Methods Starts here:
    
    @And ("User click ADD TO CART option on Canon EOS 5D item")
    public void user_click_Add_TO_CART_option_on_Canon_EOS_5D_item () {
    	desktopPage.clickOnAddCanonEOSCameraToTheCart();
    	logger.info("user added the item to the cart");
    	
    }
    @And ("User select color from dropdown Red")
    public void user_select_color_from_dropdown_red(){
    	desktopPage.selectCameraColor();
    	logger.info("user clicked on color options");
    	
    }
    
	@And ("User select quantity 1 for camera")
	public void userSelectQuantityForCamera () {
		desktopPage.selectCameraQuantity();
		logger.info("user selected 1 as the quantity for the camera");
	}
    @And ("User click add to Cart button for camera")
    public void user_click_add_Cart_button_for_camera() {
    	desktopPage.addToTheCart();
    	logger.info("user added the camera to the cart");
    }
    @Then ("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!")
    public void userShouldSeeSuccessMessageCameraAddedToTheCart () {
    	Assert.assertTrue(desktopPage.userSeeSuccessMessageCameraAddedToTheCart());
    	logger.info("user saw the message camera added successfully to the cart");
    	WebDriverUtility.takeScreenShot();
    }
    
    
    @And ("User click on Canon EOS 5D item")
    public void user_click_on_Canon_EOS_5D_item () {
    	desktopPage.userClickOnCamera();
    	logger.info("user clicked on the camera");
    }
    @And ("User click on write a review link")
    public void user_click_on_write_a_review_link () {
    	desktopPage.userClickOnWriteReviewLink();
    	logger.info("user clicked on write review link");
    }
   @And ("user fill the review information with below information")
   public void userFillTheReviewInformationWithBelowInformation (DataTable dataTable) {
	   List <Map<String, String>> info = dataTable.asMaps(String.class, String.class);
	   desktopPage.userEnterTheName(info.get(0).get("yourname"));
	   desktopPage.userWriteAReviewOnTheCamera(info.get(0).get("yourReview"));
	   desktopPage.userSelectRatingOnTheCameraFromTheRadioButtons(info.get(0).get("Rating"));
	   logger.info("user fill review form");
   }
//	   | yourname | yourReview                                               | Rating      |
//	   | name     | This is a nice website and we recomend it all customers. | Bad or good |
   
   @And ("User click on Continue Button")
   public void user_click_on_continue_button () {
	   desktopPage.userClickOnReviewCotinueButton();
	   logger.info("user clicked on continue Button");
   }
@Then ("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
public void userShouldSeeASuccessMessageOfThankYouForYourReview () {
	desktopPage.isReviewSubmissionSuccessMessageDesplayed();
	logger.info("user see success message of review submission");
	WebDriverUtility.takeScreenShot();
}

}
