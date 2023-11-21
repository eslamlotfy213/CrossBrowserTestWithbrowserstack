package qatesting;

import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestDemo {



    @Test
      public void CheckTitle() throws MalformedURLException {

      //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.139:4444"), caps);
      MutableCapabilities caps = new MutableCapabilities();

      WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
      driver.get("https://rahulshettyacademy.com");
      Assert.assertTrue(driver.getTitle().contains("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy"));

    }



}
