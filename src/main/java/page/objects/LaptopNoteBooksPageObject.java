package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	//Background starts here:
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userIsInRetailWebsite;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNoteBooks;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNoteBooks;
	
	//Add and Remove a Mac book from Cart scenario start here:
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a")
	private WebElement macBook;
	@FindBy(id = "button-cart")
	private WebElement addToTheCart;
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement successMessageMacBookAddedToTheCart;
	@FindBy (xpath = "//span[@id='cart-total']")
	private WebElement cartItem;
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement removeMacBookFromTheCart;
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement itemIsRemovedFromTheCart;
	
	//Product Comparison:
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[3]")
	private WebElement macbookCompare;
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement macAirCompare;
	@FindBy (xpath = "//div[text()=' Success: You have added ']")
	private WebElement successMessageItemAddedOnComparisonChart;
	@FindBy (xpath = "//a[text()='product comparison']")
	private WebElement productComparison;
	@FindBy (xpath = "//div[@id='content']") // Validated if the table is displayed.
	private WebElement comparisonChartValadationText;
	
	//Adding an item to wishlist starts here:
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement addSonyVioToWishList;
	@FindBy (xpath = "//div[text()=' You must ']")
	private WebElement messageAlertToUserToLoginOrCreatAccount;
	
	
	//Validate the price of MacBook Pro is starts here:
	
	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[1]/a")
	private WebElement macBookPro;
	@FindBy (xpath = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement macBookPrice;
	
	//Validate the price of MacBook Pro methods starts here:
	
	public void clickOnMacBookPro () {
		macBookPro.click();
	}
	public boolean valadateMacBookPrice () {
		String price = macBookPrice.getText().trim();
		if (price.equals("$2,000.00"))
			return true;
		else
			return false;
	}
	
	//Adding an item to wishlist methods starts here:
	public void clickOnAddSonyVioToWishListHeartButton () {
		addSonyVioToWishList.click();
	}
	
	public boolean valadateMessageAlertToUserToLoginOrCreatAccount () {
		if (messageAlertToUserToLoginOrCreatAccount.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	
	
	//Background methods starts here:
	public boolean valadateUserIsInRetailDeskTop () {
		if (userIsInRetailWebsite.isDisplayed()) 
			return true;
		else
			return false;
	}
	public void clickOnLaptopAndNoteBooksTab() {
		laptopAndNoteBooks.click();
	}
	public void userClickOnShowAllLaptopsAndNotbooks () {
		showAllLaptopsAndNoteBooks.click();
	}
	
	//Add and Remove a Mac book from Cart scenario start here:
	public void userClickOnMacBook () {
		macBook.click();
	}
	public void userClickAddMacBookToTheCart () {
		addToTheCart.click();
	}
	public boolean valadateMacBookIsSuccesfullyAddedToTheCart () {
		if (successMessageMacBookAddedToTheCart.isDisplayed())
			return true;
		else 
			return false;
	}
	public boolean valadateItemIsInTheCart () {
		String text = cartItem.getText();
		if (text.contains("1"))
			return true;
		else 
			return false;
	}
	
	public void userClickOnTheCart () {
		cartItem.click();
	}
	public void clickRemoveItemFromTheCart () {
		removeMacBookFromTheCart.click();
	}
	
	public boolean valadateItemIsSuccessfullyRemovedFromTheCart () {
		String itemRemovedText = cartItem.getText();
		if (itemRemovedText.contains("0"))
			return true;
		else 
			return false;
	}
	

	//Product Comparison methods starts here:
		public void clickOnMacBookComparisonButton () throws InterruptedException {
			macbookCompare.click();
			Thread.sleep(1000);
		}
		public void clickOnMacAirComparisonButton () throws InterruptedException {
			macAirCompare.click();
			Thread.sleep(1000);
		}
		public boolean valadateSuccessMessageItemAddedOnTheComparisonChart () {
			if (successMessageItemAddedOnComparisonChart.isDisplayed())
				return true;
			else
				return false;
		}
		public void clickOnProductComparsionLink () throws InterruptedException {
			productComparison.click();
			Thread.sleep(1000);
		}
		public boolean valadateComparisonChart () {
			if (comparisonChartValadationText.isDisplayed())
				return true;
			else
				return false;
		}
		
		
		

	
	
	
}
