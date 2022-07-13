package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement pageLogo;

	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccount;
	
	//Login objects starts here
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement enterEmail;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement enterPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement successLogedIn;

	//Register account objects starts here:
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement clickOnRegisterAffiliateLink;

	@FindBy(id = "input-company")
	private WebElement enterCompanyName;

	@FindBy(id = "input-website")
	private WebElement enterWebsite;

	@FindBy(id = "input-tax")
	private WebElement enterTaxId;

	@FindBy(xpath = "//input[@checked='checked']")
	private WebElement selectCheguePayment;

	@FindBy(id = "input-cheque")
	private WebElement enterPayeeName;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkAboutUsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//*[@id='account-account']/div[1]")
	private WebElement successLoginMessage;
	
	// Edit your affiliate account object starts here:
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAccount;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement clickOnBankRadioButton;

	@FindBy(id = "input-bank-name")
	private WebElement bankName;

	@FindBy(id = "input-bank-branch-number")
	private WebElement abaOrBranchNumber;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;

	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;

	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueBtn;

	@FindBy(xpath = "///*[@id='account-account']/div[1]")
	private WebElement successMessage;
	
	//update your account object start from here:
	@FindBy (xpath = "//a[text()='Edit your account information']")
	private WebElement editAccount;
	
	@FindBy (id ="input-firstname")
	private WebElement firstName;
	
	@FindBy (id = "input-lastname")
	private WebElement lastName;
	
	@FindBy (id = "input-email")
	private WebElement email;
	
	@FindBy (id = "input-telephone")
	private WebElement phoneNumber;
	
	@FindBy (xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
	private WebElement editAccountContinueBtn;
	
	@FindBy (xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement editAccountSuccessMessage;
	
	//Method starts here
	public boolean valadatePageLogo() {
		pageLogo.getText();
		return true;
		
	}

	public void myAccountOption() {
		myAccount.click();
	}

	public void enterEmailValue(String email) {
		enterEmail.sendKeys(email);
	}

	public void enterPasswordValue(String password) {
		enterPassword.sendKeys(password);
	}

	public void clickLoginBtn() {
		loginButton.click();
	}

	public boolean getSuccessLogin() {
		if (successLogedIn.isDisplayed())
		return true;
		else
		return false;
	}

	public void clickOnTheRegistrationAffiliateLink() {
		clickOnRegisterAffiliateLink.click();
	}

	public void enterCompanyNameValue(String companyName) {
		enterCompanyName.click();
		enterCompanyName.clear();
		enterCompanyName.sendKeys(companyName);
	}

	public void enterTaxIdValue(String taxId) {
		enterTaxId.click();
		enterTaxId.clear();
		enterTaxId.sendKeys(taxId);
	}

	public void enterWebsiteValue(String website) {
		enterWebsite.click();
		enterWebsite.clear();
		enterWebsite.sendKeys(website);
	}

	public void selectPayment(String optionSelect) {
		if (optionSelect.equalsIgnoreCase("cheque") && !selectCheguePayment.isSelected()) {
			selectCheguePayment.click();
		}
	}

	public void enterPayeeNameValue(String payeeName) {
		enterPayeeName.click();
		enterPayeeName.clear();
		enterPayeeName.sendKeys(payeeName);
	}

	public void checkTheAboutUsCheckBox() {
		if (!checkAboutUsCheckBox.isSelected()) {
			checkAboutUsCheckBox.click();
		}
	}

	public void continueBtn() {
		continueButton.click();
	}

	public boolean getSuccessRegisterMessage() {
	if (successLoginMessage.isDisplayed()) 
		return true;
	else 
		return false;
	
}

	public void clickOnEditAffiliateAccountLink() {
		editAffiliateAccount.click();
	}

//	public void selectBankAsPaymentOption(String selectPaymetType) {
//		if (selectPaymetType.equalsIgnoreCase("bank") && !clickOnBankRadioButton.isSelected()) {
//			clickOnBankRadioButton.click();
//		}
//		
//	}

	public void selectBankAsPaymentOption(String selectPayment) {
		if (selectPayment.equalsIgnoreCase("bank transfer") && !clickOnBankRadioButton.isSelected()) {
			clickOnBankRadioButton.click();
		}
	}

	public void enterBankName(String bankNameValue) {
		//bankName.click();
		bankName.clear();
		bankName.sendKeys(bankNameValue);

	}

	public void enterAbaOrBranchNumber(String abaOrBranchValue) {
		//abaOrBranchNumber.click();
		abaOrBranchNumber.clear();
		abaOrBranchNumber.sendKeys(abaOrBranchValue);
	}

	public void enterSwiftCode(String swiftCodeValue) {
		//swiftCode.click();
		swiftCode.clear();
		swiftCode.sendKeys(swiftCodeValue);
	}

	public void enterAccountOwnerName(String ownerNameValue) {
		//accountName.click();
		accountName.clear();
		accountName.sendKeys(ownerNameValue);
	}

	public void enterAccountNumber(String accountNumberValue) {
		//accountNumber.click();
		accountNumber.clear();
		accountNumber.sendKeys(accountNumberValue);
	}
	
	public void clickOnEditAffiliateAccountContinueButton () {
		continueBtn.submit();
	}

	public boolean valadateMessageAccountSuccessfullyEdited() {
		if (successMessage.isDisplayed())
		return true;
		else
		return false;
	}
	
	//Edit your account access methods start here:
	public void clickOnEditYourAccountInfo () {
		editAccount.click();
	}
	public void enterYourFirstName (String frsName) {
		//firstName.click();
		firstName.clear();
		firstName.sendKeys(frsName);
		
	}
	public void enterYourLastName (String lstName) {
		//lastName.click();
		lastName.clear();
		lastName.sendKeys(lstName);
	}
	public void enterYourEmail (String emailValue) {
		//email.click();
		email.clear();
		email.sendKeys(emailValue);
		
	}
	public void enterYourPhoneNumber (String phoneNumValue) {
		//phoneNumber.click();
		phoneNumber.clear();
		phoneNumber.sendKeys(phoneNumValue);
		
	}
	public void clickEditAccountContinueBtn () {
		editAccountContinueBtn.click();
	}
	public boolean vladateAccountEditSuccessMessage () {
		if (editAccountSuccessMessage.isDisplayed())
			return true;
		else 
			return false;
		}

}
