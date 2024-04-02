package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage {
	
	WebDriver driver;
	
	public AccountListPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH,using = "//button[text()='Add Account']")
	public WebElement AddAccountButton;
	@FindBy(how = How.XPATH,using = "//*[@id=\"account_name\"]")
	public WebElement AccountName;
	@FindBy(how = How.XPATH,using = "//*[@id=\"description\"]")
	public WebElement Description;
	@FindBy(how = How.XPATH,using = "//*[@id=\"balance\"]")
	public WebElement InitialBalance;
	@FindBy(how = How.XPATH,using = "//*[@id=\"account_number\"]")
	public WebElement AccountNumber;
	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_person\"]")
	public WebElement SaveButton;
	
public void clickAddAccountButton() {
		
		AddAccountButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
public void enterAccountName(String accountName) {
	
	AccountName.sendKeys(accountName);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void enterDescription(String description) {
	
	Description.sendKeys(description);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void enterInitialBalance(String initialBalance) {
	
	InitialBalance.sendKeys(initialBalance);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void enterAccountNumber(String accountNumber) {
	
	AccountNumber.sendKeys(accountNumber);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
public void clickSaveButton() {
	
	SaveButton.click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

}
