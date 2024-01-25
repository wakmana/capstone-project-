package sauce.scenarios.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartScen5 {
	
	@FindBy(xpath="//span[@class='title']")
	private WebElement cartText;
	
	@FindBy(id="continue-shopping")
	private WebElement continueShoppingBtn;
	
	@FindBy(id="checkout")
	private WebElement checkOutBtn;
		
	
	public YourCartScen5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getTextYourCart() {
		String text=cartText.getText();
		return text;
	}
	public void clickContinueShoppingBtn() {
		continueShoppingBtn.click();
	}
	public void clickCheckOutbtn() {
		checkOutBtn.click();
	}

}
