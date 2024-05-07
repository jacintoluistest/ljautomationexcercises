package selenium;

// Date May 7 2024
//Author: Luis Jacinto
// This class is the Base for POM Pattern

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class WebBase {
    /* Objects Required:
    static WebDriver
    static browse
    static URL
     */
    static WebDriver baseWebDriver;
    static String browseName;
    static String URL;

    public static WebDriver init(String browserName,String url){

        browseName = browserName;
        URL = url;
        switch (browserName){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeTestOptions = new ChromeOptions();
                //Chrome options prevents  an http client issue at run time
                chromeTestOptions.addArguments("--remote-allow-origins=*");
                baseWebDriver = new ChromeDriver(chromeTestOptions);
                baseWebDriver.manage().deleteAllCookies();
                baseWebDriver.manage().window().maximize();
                baseWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                baseWebDriver.get(URL);
                return baseWebDriver;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxTestOptions = new FirefoxOptions();
                firefoxTestOptions.addArguments("--remote-allow-origins=*");
                baseWebDriver = new FirefoxDriver(firefoxTestOptions);
                baseWebDriver.manage().deleteAllCookies();
                baseWebDriver.manage().window().maximize();
                baseWebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                baseWebDriver.get(URL);
                return  baseWebDriver;

            default: return null;
        }



    }
}
