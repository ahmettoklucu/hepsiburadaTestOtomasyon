package page;

import org.openqa.selenium.WebDriver;

public class Login extends Page {
    public final String emailAdress="txtUserName";
    public final String loginBtn="btnLogin";

    public final  String password="txtPassword";
    public final  String girisYap="btnEmailSelect";

    public Login(WebDriver driver) {
        super(driver);
    }
}
