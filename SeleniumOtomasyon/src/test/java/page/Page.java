package page;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    WebDriver driver;
    public  Page(WebDriver driver){
        this.driver=driver;
    }
    public  void wait(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }
    public  void waitCss(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }
    public  void waitXpath(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
    }
    public  void clickJssXpath(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
        WebElement ele = driver.findElement(By.xpath(elementId));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ele);
    }
    public  void click(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
        driver.findElement(By.id(elementId)).click();
    }
    public  void clickCss(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
        driver.findElement(By.cssSelector(elementId)).click();
    }
    public  void clickXpath(String elementId){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));
        driver.findElement(By.xpath(elementId)).click();
    }
    public  void text(String elementId,String text){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
        driver.findElement(By.id(elementId)).sendKeys(text);
    }
    public  void textCss(String elementId,String text){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
        driver.findElement(By.cssSelector(elementId)).sendKeys(text);
    }
    public void key(String elementId, Keys key){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
        driver.findElement(By.cssSelector(elementId)).sendKeys(key);
    }
}
