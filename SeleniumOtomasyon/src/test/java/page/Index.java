package page;

import org.openqa.selenium.WebDriver;

public class Index extends Page {

    public final String hesabim="myAccount";
    public final String girisYap="login";
    public final  String search="[placeholder='Ürün, kategori veya marka ara']";

    public Index(WebDriver driver) {
        super(driver);
    }
}
