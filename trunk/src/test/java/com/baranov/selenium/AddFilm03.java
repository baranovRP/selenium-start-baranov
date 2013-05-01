package com.baranov.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddFilm03 extends com.baranov.selenium.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testAddFilm03() throws Exception {    driver.get(baseUrl + "/php4dvd/");
    driver.findElement(By.id("container")).click();
    driver.findElement(By.xpath("//div[@id='content']/section/nav//li//a[contains(@href,'./?go=add')]")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("My first film");
    driver.findElement(By.name("year")).clear();
    driver.findElement(By.name("year")).sendKeys("2013");
    driver.findElement(By.name("aka")).clear();
    driver.findElement(By.name("aka")).sendKeys("blabla");
    driver.findElement(By.name("duration")).clear();
    driver.findElement(By.name("duration")).sendKeys("1000");
    driver.findElement(By.name("rating")).clear();
    driver.findElement(By.name("rating")).sendKeys("1000");
    driver.findElement(By.id("own_no")).click();
    driver.findElement(By.id("submit")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}