package Pages;

import Utility.BrowserDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BrowserDriver
{

    public static String Ham_Menu_Xpath = "//input[@type='checkbox']";
    public static String Sign_Inn_Link_Xpath ="//li[normalize-space()='Sign In Portal']";
    public static String online_product_link_Xpath ="//li[normalize-space()='Online Products']";

     public static void ClickHam_Menu() throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
         Thread.sleep(2000);
         driver.findElement(By.xpath(Ham_Menu_Xpath)).click();
     }

    public static void Click_SignIn_Link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Sign_Inn_Link_Xpath)).click();
    }
    public static void Click_OnlineProduct_Link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(online_product_link_Xpath)).click();
    }


}
