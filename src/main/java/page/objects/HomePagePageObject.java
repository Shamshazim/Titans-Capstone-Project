package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePagePageObject extends Base {
	
	public HomePagePageObject () {
		
		PageFactory.initElements(driver, this);
	}
	
	
		
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userIsOnRetailWebSite;
	
	//Change currency webelements starts here:
	
	@FindBy (xpath = "//*[@id=\"form-currency\"]/div/button")
	private WebElement currencyDropDownButton;
	
	@FindBy (xpath = "//button[@name='EUR']")
	private WebElement eruOption;
	
	@FindBy (xpath = "//strong[text()='€']")
	private WebElement currencyValue;
	
	//Checking shopig cart webelements starts here:
	
	@FindBy (xpath = "//div[@id='cart']/button")
	private WebElement cartButton;
	
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement cartIsEmpty;
	
	
	
	
	public boolean valadateUserIsOnRetailWebsite () {
		if (userIsOnRetailWebSite.isDisplayed())
			return true;
		else 
			return false;
	}
	
	//Check currency methods starts here:
	public void clickOnCurrencyDropDownButton () {
		currencyDropDownButton.click();
	}
	public void clickOnEruOption () {
		eruOption.click();
	}
	
	public boolean valadateCurrencyIsChangedToEru () {
		String currency = currencyValue.getText();
		if (currency.equals("€"))
			return true;
		else 
			return false;
	}
	
	//Checking shopig cart methods starts here:
	
	public void clickOnShopingCart () {
		cartButton.click();
		logger.info("user clicked on the shoping cart");
	}
	public boolean valadateShopingCartIsEmpty () {
		String messageClickOnCart = cartIsEmpty.getText();
		if (messageClickOnCart.equalsIgnoreCase("Your shopping cart is empty!"))
			return true;
		else
			return false;
	}

}
