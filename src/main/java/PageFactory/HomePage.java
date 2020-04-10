package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//img[@alt=\"Let's Kode It\"]")
    public static WebElement homeImg;

    @FindBy(how = How.XPATH, using = "//a[@href='/pages/practice']")
    public WebElement practiceBtn;

    @FindBy(how = How.XPATH, using = "//a[@href='/sign_up']")
    public static WebElement enrollNow;

}
