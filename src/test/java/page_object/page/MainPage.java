package page_object.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ".h3.product-title")
    private List<WebElement> listOfProducts;

    public void chooseWantedProduct(String wantedProduct) {
        for (int i = 0; i < listOfProducts.size(); i++) {
            String nameProduct = listOfProducts.get(i).getText();
            if (nameProduct.equals(wantedProduct)) {
                listOfProducts.get(i).click();
            }
        }
    }




}