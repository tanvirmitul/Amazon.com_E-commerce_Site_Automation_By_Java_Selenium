package testrunner;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import setup.Setup;

public class HomePageTestRunner extends Setup {
    HomePage homePage;

    @Test(priority = 1, description = "Select the element from the drop-down.")
    public void clickdrpdwn() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        Thread.sleep(4000);

        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.amazon.com/");

        homePage= new HomePage(driver);
        Assert.assertTrue(homePage.dropdwn.isEnabled());
        homePage.dropdwn.click();
        Thread.sleep(500);

        for(int i=0;i<3;i++){
            homePage.dropdwn.sendKeys(Keys.ARROW_DOWN);
        }
        homePage.dropdwn.sendKeys(Keys.ENTER);
        Thread.sleep(500);
    }

    @Test(priority = 2, description = "Insert the text for search and click the search button")
    public void insertText() throws InterruptedException {
        homePage= new HomePage(driver);
        Assert.assertTrue(homePage.txtSearch.isEnabled());
        homePage.txtSearch.sendKeys("bag");
        Thread.sleep(500);
        Assert.assertTrue(homePage.searchOpt.isEnabled());
        homePage.searchOpt.click();
        Thread.sleep(3000);
    }

    @Test(priority = 3, description = "Close the browser.")
    public void closeBrowser(){
        driver.close();
    }
}
