package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FeedPage extends BasePage{
    public FeedPage(WebDriver driver){
        setDriver(driver);
        //driver.get("https");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10),this);

    }
}
