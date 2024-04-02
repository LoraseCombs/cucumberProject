package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;
	DatabasePage databasePage;
	
	@Before
	public void setUp() {
//		initDriver();
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("User is on codefios login page")
	public void user_is_on_codefios_login_page() {
		driver.get("https://codefios.com/ebilling/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should be landing on dashboard page")
	public void user_should_be_landing_on_dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Title Not Found!!!", expectedTitle, actualTitle);
		takeScreenshot(driver);
	}
	
//	@When("User enters {string} from mysql database")
//	public void user_enters_from_mysql_database(String credentials) {
//		if(credentials.equalsIgnoreCase("username")) {
//			loginPage.enterUserName(databasePage.getDataFromDatabase("user_name"));
//			System.out.println("User name from DB:" + databasePage.getDataFromDatabase("user_name"));
//		}else if(credentials.equalsIgnoreCase("password")) {
//			loginPage.enterPassword(databasePage.getDataFromDatabase("user_password"));
//			System.out.println("Password from DB:" + databasePage.getDataFromDatabase("user_password"));
//		}else {
//			System.out.println("Unable to retrieve data from DB");
//		}
//	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
