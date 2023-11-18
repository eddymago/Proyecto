package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalculatorTest {

    AppiumDriver mobile;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName","UCB_DIPLOMADO");
        config.setCapability("platformVersion","9.0");
        config.setCapability("appPackage","com.android.calculator2");
        config.setCapability("appActivity","com.android.calculator2.Calculator");
        config.setCapability("platformName","Android");
        config.setCapability("automationName","uiautomator2");
        //implicit /explicit /fluent
        mobile = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),config);
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void verifySomething() throws InterruptedException {
        // click 7
        mobile.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        // click +
        mobile.findElement(By.id("com.android.calculator2:id/op_add")).click();
        // click 6
        mobile.findElement(By.id("com.android.calculator2:id/digit_6")).click();
        // click =
        mobile.findElement(By.id("com.android.calculator2:id/eq")).click();

        Thread.sleep(5000);
        // verificacion  expected vs actual
        String expectedResult = "13";
        String actualResult =  mobile.findElement(By.id("com.android.calculator2:id/result")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }
    @AfterEach
    public void closeApp(){
        mobile.quit();
    }

}