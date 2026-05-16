package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By cartTitle = By.className("title");
    private By backpackItem = By.className("inventory_item_name");
    private By checkoutButton = By.id("checkout");
    private By removeButton = By.id("remove-sauce-labs-backpack");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartTitle() {
        return driver.findElement(cartTitle).getText();
    }

    public String getItemName() {
        return driver.findElement(backpackItem).getText();
    }

    public void removeItem() {
        driver.findElement(removeButton).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}