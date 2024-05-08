package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.AutomationExcerciseLoginPage;
import selenium.WebBase;

import java.time.Duration;


public class TestLogin {
    WebDriver testDriver;
    WebDriverWait waitForElement;
    AutomationExcerciseLoginPage aelp;
    WebElement error;

    @BeforeTest
    public void SetUp(){
        String url = "https://automationexercise.com/login";
        testDriver = WebBase.init("chrome",url);
        testDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        aelp = new AutomationExcerciseLoginPage(testDriver);
    }

    @Test
    public void invalidLogin(){
        aelp.login("test@test.com","12345");
        error = testDriver.findElement(By.cssSelector(".login-form p"));
        Assert.assertTrue(error.isDisplayed());
    }

    @Test
    public void elementsAvailable(){
        //Assert.assertTrue(aelp.logo.isDisplayed());
        Assert.assertTrue(aelp.title.isDisplayed());
    }

    @AfterTest
    public void tearDown(){
        testDriver.close();
        testDriver.quit();
    }


}
