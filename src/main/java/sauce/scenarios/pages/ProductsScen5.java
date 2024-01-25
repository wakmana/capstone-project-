package sauce.scenarios.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsScen5 {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart1;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addToCart2;
	
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement removeFromCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement sortBtn;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addToCart3;
	
	public ProductsScen5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addToCartFirstItem() {
		addToCart1.click();
	}
	public void addToCartThirdItem() {
		addToCart2.click();
	}
	public void removeFirstItemFromCart() {
		removeFromCart.click();
	}
	public void clickCartIcon() {
		cartIcon.click();
	}
	public void clickSortBtn() {
		Select selctHighToLowPrice=new Select(sortBtn);
		selctHighToLowPrice.selectByIndex(3);
	}
	public void addToCartExpensiveItem() {
		addToCart3.click();
	}
	
	
}
