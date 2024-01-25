package sauce.scenarios.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartScen5 {

    @FindBy(xpath="//div[@class='cart_item']")
    private List<WebElement> cartItems;

    public ShoppingCartScen5(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public int getCartItemCount() {
    	   return cartItems.size();
    }

}
