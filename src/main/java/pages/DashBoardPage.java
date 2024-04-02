package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how = How.XPATH,using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[3]/a/span")
	public WebElement ListAccount;
	
public void clickOnListAccount() {
		
		ListAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
