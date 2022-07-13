package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	// Background page elements starts here:
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userIsOnDesktop;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopTab;

	//user verify all item are displyed in desktop
	@FindBy(xpath = "//img[@title='Desktops']")
	private WebElement desktopPageItems;

	//User add HP LP 3065 from Desktops tab to the cart elements starts here:
	@FindBy(xpath = " //*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement addLaptopToTheCart;

	@FindBy(id = "input-quantity")
	private WebElement selectQuantity;

	@FindBy(id = "button-cart")
	private WebElement addToCart;

	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement sucessMessage;
	
	//User add Canon Camera to the cart elements starts here:
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement addCanonEOSCameraToTheCart;
	

	@FindBy (xpath = "//select[@id='input-option226']/option[2]")
	private WebElement selectColorRed;
	
//	@FindBy (id = "input-quantity")
//	private WebElement cameraQuantity;
//	
//	@FindBy (id = "button-cart")
//	private WebElement clickAddToTheCart;
	
	@FindBy (xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessageCameraAdded;
	
	//Review on Cannon EOS UI elements starts here:
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a")
	private WebElement clickOnCamera;
	@FindBy (xpath = "//a[text()='Write a review']")
	private WebElement writeAReview;
	@FindBy (xpath = "//input[@id='input-name']")
	private WebElement enterYourName;
	@FindBy	(xpath = "//textarea[@id='input-review']")
	private WebElement writeYourReview;
	@FindBy (xpath = "//input[@name='rating']")
	private List<WebElement> ratingSelection;
	@FindBy (xpath = "//button[@id='button-review']")
	private WebElement rviewContinueButton;
	@FindBy (xpath = "//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement reviewSubmissionSuccessMessage;
	
	
	
	
	public boolean isUserIsOnDeskTopPage() {
		if (userIsOnDesktop.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnDesktopTab() {
		desktopTab.click();
	}

	public void clickOnShowAllDesktopTab() {
		showAllDesktopTab.click();
	}

	public boolean isDesktopItemAreDisplayed() {
		if (!desktopPageItems.isDisplayed())
			return false;
		else
			return true;

	}

	public void clickAddLaptopHpToTheCart() {
		addLaptopToTheCart.click();
	}

	public void clickOnSelectLaptopQuantity() { 
		selectQuantity.clear();
		selectQuantity.sendKeys("1");
	}

	public void addToTheCart() {
		addToCart.click();
	}

	public boolean valadateLaptapIsSuccessfullyAddedToTheCart() {
		if (sucessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnAddCanonEOSCameraToTheCart () {
		addCanonEOSCameraToTheCart.click();
	}
	
		
	public void selectCameraColor() {
		selectColorRed.click();
		
	}
	
	public void selectCameraQuantity () {
		selectQuantity.clear();
		selectQuantity.sendKeys("1");
	}
	
	public boolean userSeeSuccessMessageCameraAddedToTheCart () {
		if (successMessageCameraAdded.isDisplayed())
			return true;
		else 
			return false;
	}
	
	//Review on Camera methods starts here:
	
	public void userClickOnCamera () {
		clickOnCamera.click();
	}
	public void userClickOnWriteReviewLink () {
		writeAReview.click();;
	}
	public void userEnterTheName (String name) {
		enterYourName.sendKeys(name);
	}
	public void userWriteAReviewOnTheCamera (String review) {
		writeYourReview.sendKeys(review);
	}
	public void userSelectRatingOnTheCameraFromTheRadioButtons (String rating) {
		for (WebElement e: ratingSelection ) {
				e.click();
		}
	}
	public void userClickOnReviewCotinueButton () {
		rviewContinueButton.click();
	}
	public boolean isReviewSubmissionSuccessMessageDesplayed () {
		if (reviewSubmissionSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
}
