package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HomePage extends Base {
    private final By searchBarXPath = By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[1]");
    private final By searchIconXPath = By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[2]");
    private final By shoppingCardButtonXPath = By.xpath("/html/body/div[3]/div/div[2]/div/form/button");
    private final By quickViewButtonXPath = By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[5]/div/div[1]/div/div/a");
    private final By quickViewContainerXPath = By.xpath("/html/body/div[7]/div");
    private final By addToCardButtonXPath = By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[4]/div/div[2]/div[2]/form/fieldset/input[10]");
    private final By quantityTabXPath = By.xpath("//*[@id=\"PPMiniCart\"]/form/ul/li/div[2]/input");
    private final By shoppingCardPopUpXPath = By.xpath("//*[@id=\"PPMiniCart\"]/form");
    private final By outsideShoppingCardPopUpXPath = By.xpath("/html/body/div[7]");
    private final By mensWearCategoryXPath = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a");
    private final By mensClothingXPath = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/div/div[2]/ul/li/a");
    private final By mensAccessoriesXPath = By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/div/div[3]/ul/li/a");

    private final By facebookButtonXPath = By.xpath("/html/body/div[14]/div/div[1]/ul/li[1]/a/div[1]");

    public HomePage() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");
    }

    public void writeInSearchBar(String item) {
        WebElement searchBar = driver.findElement(searchBarXPath);
        searchBar.sendKeys(item);
    }

    public void clickOnSearchIcon() {
        WebElement searchIcon = driver.findElement(searchIconXPath);
        searchIcon.click();
    }

    public void clickOutsideShoppingCardPopUp() {
        WebElement outsideShoppingCard = driver.findElement(outsideShoppingCardPopUpXPath);
        outsideShoppingCard.click();
    }

    public void clickOnShoppingCardButton() {
        WebElement shoppingCardButton = driver.findElement(shoppingCardButtonXPath);
        shoppingCardButton.click();
    }

    public void clickOnQuickViewButton() {
        WebElement ele = driver.findElement(quickViewButtonXPath);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
    }

    public boolean isQuickViewPage() { return driver.findElement(quickViewContainerXPath).isDisplayed();}

    public void clickOnFacebookButton() {
        WebElement facebookButton = driver.findElement(facebookButtonXPath);
        facebookButton.click();
    }

    public boolean isFacebook() {
        return driver.getCurrentUrl().contains("facebook");
    }

    public void clickOnAddToCardButton() {
        WebElement addToCardButton = driver.findElement(addToCardButtonXPath);
        addToCardButton.click();
    }

    public boolean isQuantityCorresponding() {
        return driver.findElement(quantityTabXPath).getAttribute("value").contentEquals("2");
    }

    public boolean isShoppingCardPopUpDisplayed() {
        return driver.findElement(shoppingCardPopUpXPath).isDisplayed();
    }

    public void clickOnMensWearButton() {
        WebElement mensWearCategoryButton = driver.findElement(mensWearCategoryXPath);
        mensWearCategoryButton.click();
    }

    public void clickOnMensClothingButton() {
        WebElement mensClothing = driver.findElement(mensClothingXPath);
        mensClothing.click();
    }

    public void clickOnMensAccessoriesButton() {
        WebElement mensAccessories = driver.findElement(mensAccessoriesXPath);
        mensAccessories.click();
    }

    public boolean isMensClothingPageDisplayed() {
        return driver.getCurrentUrl().contains("mens.html");
    }

    public boolean isMensAccessoriesPageDisplayed() {
        return driver.getCurrentUrl().contains("mens2.html");
    }

    public boolean is404() {
        return driver.findElement(By.xpath("//p[contains(text(), '404')]")).isDisplayed();
    }
}
