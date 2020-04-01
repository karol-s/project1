package page_object.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HummingbirdPrintedTshirtPage {

    public HummingbirdPrintedTshirtPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".discount.discount-percentage")
    private WebElement disscountInformation;

    @FindBy(id = "group_1")
    private WebElement sizeSelect;

    @FindBy(id = "quantity_wanted")
    private WebElement quantityWanted;

    @FindBy (xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement submitButton;


    public void checkDiscount(String expectedDiscount) {
        String actualDiscount = disscountInformation.getText();

        Assert.assertEquals(expectedDiscount, actualDiscount);
    }

    public void selectSize(String size) {
        new Select(sizeSelect).selectByVisibleText(size);
    }

    public void selectQuantity(String quantity) {
        quantityWanted.clear();
        quantityWanted.sendKeys(quantity);
    }

    public void clickSubmitButton() {
        submitButton.click();

    }

}