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
import page.objects.HomePage;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {

	HomePage homePage = new HomePage ();

	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		Assert.assertTrue(homePage.valadatePageLogo());
		logger.info("user successfully logged in into the account");
		WebDriverUtility.takeScreenShot();
	}

	@When("user click on MyAccount")
	public void user_click_on_MyAccount() {
		homePage.myAccountOption();
		logger.info("user clicked on myAccount");
	}

	@And("user click on login option")
	public void user_click_on_login_option() {
		homePage.clickLoginBtn();
		logger.info("user clicked on login button");
	}
	@And("user enter user name {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		homePage.enterEmailValue(email);
		logger.info("user entered the email");
		homePage.enterPasswordValue(password);
		logger.info("User entered the password");

	}

	@And("user click on the login button")
	public void user_click_on_the_login_button() {
		homePage.clickLoginBtn();
		logger.info("User clicked on login button");

	}

	@Then("user should be able to logged into account")
	public void user_should_able_to_logged_into_account() {
		Assert.assertTrue(homePage.getSuccessLogin());
		logger.info("User successfuly logged in");
		WebDriverUtility.takeScreenShot();
	}

	// Register Affiliate Account Starts Here
	@When("user click on the Register for an Affiliate account link")
	public void user_click_on_the_Registration_for_an_Affiliate_account_link() throws InterruptedException {
		homePage.clickOnTheRegistrationAffiliateLink();
		logger.info("user clicked on the registration link");
		Thread.sleep(1000);
	}

	@And("user fill affiliate form with below information")
	public void user_fill_affiliate_form_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> listInfo = dataTable.asMaps(String.class, String.class);
//		
//		| company   | website          | taxID | paymentMethod | Payee Name |
//	      | TekSchool | www.tekschool.us |   332 | cheqe         | Student    |
		
		homePage.enterCompanyNameValue(listInfo.get(0).get("company"));
		homePage.enterWebsiteValue(listInfo.get(0).get("website"));
		homePage.enterTaxIdValue(listInfo.get(0).get("taxID"));
		homePage.selectPayment(listInfo.get(0).get("paymentMethod"));
		homePage.enterPayeeNameValue(listInfo.get(0).get("Payee Name"));
		logger.info("user entered affiliate register info");
		Thread.sleep(1000);
	}
	
	@And("user check on About us check box")
	public void user_check_on_About_us_check_box() {
		homePage.checkTheAboutUsCheckBox();
		logger.info("user checked About us check box");
	}

	@And("user click on Continue button")
	public void user_click_on_Continue_button() {
		homePage.continueBtn();
		logger.info("user clicked on continue button");
	}

	@Then("user should see a success message")
	public void user_should_see_a_success_Register_message() {
		Assert.assertTrue(homePage.getSuccessRegisterMessage());
		logger.info("user successfuly registered as affiliate");
		WebDriverUtility.takeScreenShot();
	}

	//Edit Affiliate Account start here:
	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() throws InterruptedException {
		homePage.clickOnEditAffiliateAccountLink();
		logger.info("user clicked on edit affiliate account link");
		Thread.sleep(1000);
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_Bank_Transfer_radio_button() {
		homePage.selectBankAsPaymentOption("bank transfer");
		logger.info("user selected bank transfer button");
	}

	@When("User fill Bank information with below information")
	public void user_fill_Bank_information_with_below_information(DataTable dataTable) {
		// | bankName | abaNumber | swiftCode | accountName | accountNumber |
		List<Map<String, String>> infoForList = dataTable.asMaps(String.class, String.class);
		homePage.enterBankName(infoForList.get(0).get("bankName"));
		homePage.enterAbaOrBranchNumber(infoForList.get(0).get("abaNumber"));
		homePage.enterSwiftCode(infoForList.get(0).get("swiftCode"));
		homePage.enterAccountOwnerName(infoForList.get(0).get("accountName"));
		homePage.enterAccountNumber(infoForList.get(0).get("accountNumber"));
		logger.info("User filled the account information");
		
//		List<Map<String, String>> affiliateInfo = data.asMaps(String.class, String.class);
//		
//		homePage.enterBankName(affiliateInfo.get(0).get("bankName"));
//		homePage.enterAbaOrBranchNumber(affiliateInfo.get(0).get("abaNumber"));
//		homePage.enterSwiftCode(affiliateInfo.get(0).get("swiftCode"));
//		homePage.enterAccountOwnerName(affiliateInfo.get(0).get("accountName"));
//		homePage.enterAccountNumber(affiliateInfo.get(0).get("accountNumber"));
//		logger.info("User filled the account information");

	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		homePage.clickOnEditAffiliateAccountContinueButton();
		logger.info("user clicked on continue button");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws InterruptedException {
		homePage.vladateAccountEditSuccessMessage ();
		Assert.assertTrue(homePage.vladateAccountEditSuccessMessage());
		logger.info("user see the messages successfully edited the account");
		Thread.sleep(1000);
		WebDriverUtility.takeScreenShot();

	}
	
	
	//User update account here:
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() throws InterruptedException {
		homePage.clickOnEditYourAccountInfo();;
	    logger.info("user clicked on edit account link");
	    Thread.sleep(1000);
	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//		| firstName | lastName | email                 | telephone  |
//	      | Shams     | Hazim    | shams.hazim@gmail.com | 9163181921 |
		List <Map<String, String>> editInfo = dataTable.asMaps(String.class, String.class);
		homePage.enterYourFirstName(editInfo.get(0).get("firstName"));
		homePage.enterYourLastName(editInfo.get(0).get("lastName"));
		homePage.enterYourEmail(editInfo.get(0).get("email"));
		homePage.enterYourPhoneNumber(editInfo.get(0).get("telephone"));
		Thread.sleep(1000);
		logger.info("user updated the information form");
	
	}
	@When("User click on edit continue button")
	public void user_click_on_edit_continue_button() throws InterruptedException {
	    homePage.clickEditAccountContinueBtn();
	    logger.info("user clicked on edit continue button");
	    Thread.sleep(1000);
	}
	@Then("User should see a message ‘Success: Your account has been successfully updated.")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws InterruptedException {
	    homePage.vladateAccountEditSuccessMessage ();
	    logger.info("account successfully edited");
	    Thread.sleep(1000);
	    WebDriverUtility.takeScreenShot();
	}
	

}
