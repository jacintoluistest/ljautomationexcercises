package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AutomationExcerciseLoginPage {
    // The constructor class requires a WebDriver object
    public AutomationExcerciseLoginPage(WebDriver driver){
        //Initalize web elements
        //Page Factory class allows to use @FindBy annotation to set up Web Elements
        PageFactory.initElements(driver, this);
    }

    WebDriver testDriver;
    public Boolean isErrorMessagePresent;

    //Web elements set up

    // AutomationExcercise Elements
    @FindBy(name="email")
    private WebElement emailInput;

    @FindBy(name="password")
    private WebElement passInput;
    @FindBy(css=".btn:nth-child(4)")
    private WebElement loginButton;
    @FindBy(name="name")
    private WebElement nameInput;
    @FindBy(css=".signup-form input:nth-child(3)")
    private WebElement emailAddressInput;

    @FindBy(css=".signup-form .btn")
    private WebElement signUpButton;

    @FindBy(xpath="/html/body/section/div/div/div[1]/div/h2")
    public WebElement title;

    @FindBy(css="a > img")
    public WebElement logo;


    public void login(String user, String pass){
        emailInput.sendKeys(user);
        passInput.sendKeys(pass);
        loginButton.click();
    }

}
