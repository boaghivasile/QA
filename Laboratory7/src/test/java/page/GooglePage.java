package page;

import base.Base;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class GooglePage extends Base {
    private final By searchBarXPath = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
    private final By googleHeaderXPath = By.xpath("//*[@id=\"searchform\"]/div[2]/div");


    public GooglePage() {
        driver.get("https://www.google.com");
    }

    public void writeInSearchBar(String string) {
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys(string);
        searchBar.sendKeys(Keys.ENTER);
    }

    public boolean isHeaderDisplayed() { return driver.findElement(googleHeaderXPath).isDisplayed(); }

}
