package com.AutomationTalks.demoProject1;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test2 {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tadi3\\Documents\\eclipse-workspace\\chromedriver.exe");
     //   WebDriver driver = new ChromeDriver(capabilities);
      //  driver.get("https://chercher.tech");
       // System.out.println(driver.getTitle());
        
        
        System.setProperty("webdriver.gecko.driver","C:\\Users\\tadi3\\Documents\\eclipse-workspace\\geckodriver.exe");

        DesiredCapabilities firefoxProfile = new DesiredCapabilities();
        firefoxProfile.setCapability("browser.private.browsing.autostart",true);
        WebDriver driver1 = new FirefoxDriver(firefoxProfile);
        driver1.get("https://chercher.tech");
        System.out.println(driver1.getTitle());
	}

}
