package PastePo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PastePo {
    private ChromeDriver driver;

    public PastePo() {
        this.driver = new ChromeDriver();
        driver.get("https://pastebin.com");
    }

    public WebElement getCodeInput() {
        return driver.findElement(By.id("postform-text"));
    }

    public WebElement getNameInput() {
        return driver.findElement(By.id("postform-name"));
    }

    public void setExpiration() {
        WebElement expirationElement = this.driver.findElement(By.id("postform-expiration"));
        Select expirationSelect = new Select(expirationElement);

//        TODO: fails to select option
        expirationSelect.selectByVisibleText("10 Minutes");
    }

    public void submitPaste() {
        WebElement submitBtn = this.driver.findElement(By.xpath("//button[@type='submit']"));

        submitBtn.click();
    }

    public void quit() {
        this.driver.quit();
    }
}

