package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoScen4 {
	
	@FindBy(id="first-name")
	private WebElement firstNameTextBox;
	
	@FindBy(id="last-name")
	private WebElement lastNameTextBox;
	
	@FindBy(id="postal-code")
	private WebElement zipCodeTextBox;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public PersonalInfoScen4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstNameTextBox(String firstName) {
		firstNameTextBox.sendKeys(firstName);
	}
	public void enterLastNameTextBox(String lastName) {
		lastNameTextBox.sendKeys(lastName);
	}
	public void enterZipCode(String zipCode) {
		zipCodeTextBox.sendKeys(zipCode);
	}
	public void clickContinueBtn() {
		continueBtn.click();
	}

}
