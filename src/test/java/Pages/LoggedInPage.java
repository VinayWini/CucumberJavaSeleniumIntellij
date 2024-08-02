package Pages;


import Utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoggedInPage extends BrowserDriver
{
    public static String FormalShoePath = "//div[@id='SmokeTests']";
    public static String SportsShoePath ="//div[@id='RegressionTests']";
    public static String SneakerShoePath ="//div[@id='VanguardTests']//h3[@id='ShoeType']";


    public static void CheckFormalShoe() throws InterruptedException {

        Thread.sleep(2000);
       String ActualF =driver.findElement(By.xpath(FormalShoePath)).getText();
       System.out.println(ActualF);
        //assertEquals(ActualF,"Formal Shoes");
        assertTrue(ActualF.contains("Formal Shoes"));
        //assertEquals("Formal Shoes", ActualF);
    }

    public static void CheckSportsShoe() throws InterruptedException {
        Thread.sleep(2000);
        String ActualS = driver.findElement(By.xpath(SportsShoePath)).getText();
        System.out.println(ActualS);
        //assertEquals("Sports", ActualS);
        assertTrue(ActualS.contains("Sports"));
    }
    public static void CheckSneakerShoe() throws InterruptedException {
        Thread.sleep(2000);
        String ActualSne = driver.findElement(By.xpath(SneakerShoePath)).getText();
        System.out.println(ActualSne);
        //assertEquals("Sneakers", ActualSne);
        assertTrue(ActualSne.contains("Sneakers"));
    }
}
