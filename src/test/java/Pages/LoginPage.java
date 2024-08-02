package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;


public class LoginPage extends BrowserDriver
{
    public static String UserName = "//input[@id='usr']";
    public static String Password ="//input[@id='pwd']";
    public static String LgnButton ="//input[@value='Login']";
    public static String NewUsrLink="//button[@id='NewRegistration']";

    public static void SendUserName() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(UserName)).sendKeys("scott.gale@gmail.com");
    }

    public static void SendPassKey() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Password)).sendKeys("P@sword!");
    }
    public static void ClickLoginKey() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(LgnButton)).click();
    }
    public static void ClickOnNewUsr() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(NewUsrLink)).click();
    }
}
