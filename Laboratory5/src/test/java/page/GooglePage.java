package page;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class GooglePage extends Base {
    private final By searchBarXPath = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
    private final By searchButtonXPath = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
    private final By googleHeaderXPath = By.xpath("//*[@id=\"searchform\"]/div[2]/div");


    public GooglePage() {
        driver.get("https://www.google.com/");
    }

    public void writeInSearchBar(String string) {
        WebElement searchBar = driver.findElement(searchBarXPath);
        searchBar.sendKeys(string);
    }

    public void clickOnSearchButton() {
        WebElement searchButton = driver.findElement(searchButtonXPath);
        searchButton.click();
    }

    public boolean isHeaderDisplayed() { return driver.findElement(googleHeaderXPath).isDisplayed(); }

}
