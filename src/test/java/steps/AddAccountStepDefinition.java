package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import pages.AccountListPage;
import pages.TestBase;

public class AddAccountStepDefinition extends TestBase {
	AccountListPage accountListPage;
	
	@Before
	public void setUp() {
		initDriver();
		accountListPage= PageFactory.initElements(driver, AccountListPage.class);
	}

	@When("User clicks on Add Account button")
	public void user_clicks_on_Add_Account_button() {
	    accountListPage.clickAddAccountButton();
	}

	@When("User enters Account Name as {string}")
	public void user_enters_Account_Name_as(String accountName) {
	   accountListPage.enterAccountName(accountName);
	}

	@When("User enters Description as {string}")
	public void user_enters_Description_as(String description) {
	   accountListPage.enterDescription(description); 
	}

	@When("User enters Initial Balance as {string}")
	public void user_enters_Initial_Balance_as(String initialBalance) {
	   accountListPage.enterInitialBalance(initialBalance); 
	}

	@When("User enters Account Number as {string}")
	public void user_enters_Account_Number_as(String accountNumber) {
	   accountListPage.enterAccountNumber(accountNumber);
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
	    accountListPage.clickSaveButton();
	}

}
