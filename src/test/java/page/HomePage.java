package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {
    @FindBy(id = "searchDropdownBox")
    public WebElement dropdwn;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchOpt;
    @FindBy(name = "field-keywords")
    public WebElement txtSearch;
public HomePage(WebDriver driver){
    PageFactory.initElements(driver,this);
}
}
