package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OnlineProductPage extends BrowserDriver
{
    public static String FormalShoeDropdown = "//i[@class='fa fa-angle-double-down formalshoedropdown']";
    public static String FormalShoeDropdownTable = "/html/body/div[2]/table";
    public static String FormalShoeDropdownTableTr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void ClickShoeDropdown() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(FormalShoeDropdown)).click();

    }
    public static void CheckFormalShoeDropdownTable()
        {
         String  ActualProductName = driver.findElement(By.xpath(FormalShoeDropdownTableTr)).getText();
         String ExpectedProductName = "   Classic Cheltenham";
            assertEquals(ActualProductName, ExpectedProductName);
        }


}
