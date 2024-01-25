package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageScen2 {
	
	@FindBy(id="user-name")
	private WebElement userNameTextBox;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
	private WebElement erorrMsg;

	
	public LoginPageScen2(WebDriver driver) {
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
	public String getErrorMessage() {
		String message=erorrMsg.getText();
		return message;
	
	}

}
