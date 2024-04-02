package steps;

import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.TestBase;

public class DashboardStepDefinition extends TestBase {
	
	DashBoardPage dasboardPage;
	
	@When("User clicks on List Account button")
	public void user_clicks_on_List_Account_button() {
		dasboardPage= PageFactory.initElements(driver, DashBoardPage.class);
	    dasboardPage.clickOnListAccount();
	}

}
