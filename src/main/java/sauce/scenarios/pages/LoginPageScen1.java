package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageScen1 {
	@FindBy(id="user-name")
	private WebElement userNameTextBox;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	public LoginPageScen1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String userName) {
		userNameTextBox.sendKeys(userName);
	}
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}

}
