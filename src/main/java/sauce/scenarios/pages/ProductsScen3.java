package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsScen3 {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartIconButn;
	
	public ProductsScen3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickCartIconButn() {
		cartIconButn.click();
	}

}
