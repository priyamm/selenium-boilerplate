package com.example.test.SeleniumBoilerPlate;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {
  public static WebDriver driver;

  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    // assertTrue( true );
    // This line tells your test where to find the chromedriver, which is the
    // "glue"
    // between Selenium and the Chrome installation on your machine
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

    // Start a new Chrome browser instance and maximize the browser window
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    // Navigate to the Amazon.com home page
    driver.get("https://www.amazon.com/");

    // Type "Software testing" in the search window
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software Testing");

    // Click on the search button
    driver.findElement(By.xpath("//input[@value='Go']")).click();

    // Select the first item in the list of search results
    driver.findElement(By.xpath("(//div[@id='resultsCol']//a[contains(@class,'access-detail-page')])[1]")).click();

    // Check that the page title contains the term "Software Testing"
    Assert.assertTrue(driver.getTitle().contains("Software Testing"));

    // Close the browser
    driver.quit();
  }
}
