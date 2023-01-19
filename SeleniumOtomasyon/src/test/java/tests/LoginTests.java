package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.Index;
import page.Login;
import page.Sales;

import java.time.Duration;

public class LoginTests {

    private Index index;
    private Login login;
    private WebDriver driver;
    private Sales sales;
    @BeforeEach
    void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        index=new Index(driver);
        login=new Login(driver);
        sales=new Sales(driver);
        driver.get("https://www.hepsiburada.com");
    }

    @Test
    void hupsiburadaLoginTest(){
        index.click(index.hesabim);
        index.click(index.girisYap);
        login.text(login.emailAdress, "tt7447189@gmail.com");
        login.click(login.loginBtn);
    }
    @Test
    void searchTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
    }
    @Test
    void searchFilterArtanTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.artan);
    }
    @Test
    void searchFilterAzalanTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.azalan);
    }
    @Test
    void searchFilterCokSatanTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.cokSatan);
    }
    @Test
    void searchFilterCokDegerlendirilenTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.cokDegerlendirilen);
    }
    @Test
    void searchFilterYuksekPuanTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.yuksekPuan);
    }
    @Test
    void searchFilterIndirimOraniTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.indirimOrani);
    }
    @Test
    void searchFilterYeniEklenenlerTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.filter);
        sales.clickJssXpath(sales.yeniEklenenler);
    }
    @Test
    void searchMarkaTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.marka);
    }
    @Test
    void searchUrunCesidiTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.urunCesidi);
    }
    @Test
    void searchFiyatAralikTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.fiyatAralik);
    }
    @Test
    void searchDegerlendirmePuanTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.degerlendirmePuan);
    }
    @Test
    void searchkuponluUrunPuanTest() {
        index.textCss(index.search, "araba");
        index.key(index.search, Keys.ENTER);
        sales.clickJssXpath(sales.kuponluUrun);
    }


    @AfterEach
    void tearDown(){
       driver.close();
    }
}
