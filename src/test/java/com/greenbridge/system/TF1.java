package com.greenbridge.system;// Generated by Selenium IDE
import com.greenbridge.GreenBridgeApplication;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment =SpringBootTest.WebEnvironment.DEFINED_PORT, classes = GreenBridgeApplication.class)
public class TF1 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws InterruptedException {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    sleep(2000);
  }
  @After
  public void tearDown() {
    driver.quit();
  }


  @Test
  public void tC11() throws InterruptedException {

    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(782, 823));
    driver.findElement(By.id("email")).sendKeys("fernandaiannuzzi@example.org");
    driver.findElement(By.id("password")).sendKeys("yBmaNPq%Qw!v5C2r");
    driver.findElement(By.cssSelector(".inputButton")).click();
    sleep(2000);
    driver.findElement(By.cssSelector("a:nth-child(6) > .imgIcon")).click();
    driver.findElement(By.cssSelector(".item-quant > form > .item")).click();
    driver.findElement(By.id("delivery")).click();
    driver.findElement(By.id("via")).click();
    driver.findElement(By.id("via")).sendKeys("Cortile Radunanza ");
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).sendKeys("33");
    driver.findElement(By.id("cap")).click();
    driver.findElement(By.id("cap")).sendKeys("Toto&");
    driver.findElement(By.id("citta")).click();
    driver.findElement(By.id("citta")).sendKeys("San Giuseppe Vesuviano");
    driver.findElement(By.id("provincia")).sendKeys("Na");
    driver.findElement(By.cssSelector(".container button")).click();
    assertThat(driver.switchTo().alert().getText(), is("formato cap non corretto"));
  }

  @Test
  public void tC12() throws InterruptedException {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(782, 823));
    driver.findElement(By.id("email")).sendKeys("fernandaiannuzzi@example.org");
    driver.findElement(By.id("password")).sendKeys("yBmaNPq%Qw!v5C2r");
    driver.findElement(By.cssSelector(".inputButton")).click();
    sleep(2000);
    driver.findElement(By.cssSelector("a:nth-child(6) > .imgIcon")).click();
    driver.findElement(By.cssSelector(".item-quant > form > .item")).click();
    driver.findElement(By.id("delivery")).click();
    driver.findElement(By.id("via")).click();
    driver.findElement(By.id("via")).sendKeys("Cortile Radunanza ");
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).sendKeys("33*ACV");
    driver.findElement(By.id("cap")).click();
    driver.findElement(By.id("cap")).sendKeys("80047");
    driver.findElement(By.cssSelector(".container")).click();
    driver.findElement(By.id("citta")).sendKeys("San Giuseppe Vesuviano");
    driver.findElement(By.id("provincia")).sendKeys("NA");
    driver.findElement(By.cssSelector(".container button")).click();
    assertThat(driver.switchTo().alert().getText(), is("formato civico non corretto"));
  }

  @Test
  public void tC13() throws InterruptedException {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(782, 823));
    driver.findElement(By.id("email")).sendKeys("fernandaiannuzzi@example.org");
    driver.findElement(By.id("password")).sendKeys("yBmaNPq%Qw!v5C2r");
    driver.findElement(By.cssSelector(".inputButton")).click();
    sleep(2000);
    driver.findElement(By.cssSelector("a:nth-child(6) > .imgIcon")).click();
    driver.findElement(By.cssSelector(".item-quant > form > .item")).click();
    driver.findElement(By.id("delivery")).click();
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).sendKeys("33");
    driver.findElement(By.id("cap")).click();
    driver.findElement(By.id("cap")).sendKeys("80047");
    driver.findElement(By.id("citta")).sendKeys("Napoli - NA");
    driver.findElement(By.cssSelector(".container")).click();
    driver.findElement(By.id("citta")).sendKeys("San Giuseppe Vesuviano");
    driver.findElement(By.id("provincia")).sendKeys("NA");
    driver.findElement(By.cssSelector(".container button")).click();
    assertThat(driver.switchTo().alert().getText(), is("formato via non corretto"));
  }
  @Test
  public void tC14() throws InterruptedException {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(782, 823));
    driver.findElement(By.id("email")).sendKeys("fernandaiannuzzi@example.org");
    driver.findElement(By.id("password")).sendKeys("yBmaNPq%Qw!v5C2r");
    sleep(2000);
    driver.findElement(By.cssSelector(".inputButton")).click();
    sleep(2000);
    driver.findElement(By.cssSelector("a:nth-child(6) > .imgIcon")).click();
    driver.findElement(By.cssSelector(".item-quant > form > .item")).click();
    driver.findElement(By.id("delivery")).click();
    driver.findElement(By.id("via")).click();
    driver.findElement(By.id("via")).sendKeys("Cortile Radunanza ");
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).sendKeys("33");
    driver.findElement(By.id("cap")).click();
    driver.findElement(By.id("cap")).sendKeys("80047");
    driver.findElement(By.id("citta")).click();
    driver.findElement(By.id("citta")).sendKeys("San 34ù");
    driver.findElement(By.id("provincia")).sendKeys("NA");
    driver.findElement(By.cssSelector(".container button")).click();
    assertThat(driver.switchTo().alert().getText(), is("formato citta non corretto"));
  }
  @Test
  public void tC15() throws InterruptedException {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(782, 823));
    driver.findElement(By.id("email")).sendKeys("fernandaiannuzzi@example.org");
    driver.findElement(By.id("password")).sendKeys("yBmaNPq%Qw!v5C2r");
    driver.findElement(By.cssSelector(".inputButton")).click();
    sleep(2000);
    driver.findElement(By.cssSelector("a:nth-child(6) > .imgIcon")).click();
    driver.findElement(By.cssSelector(".item-quant > form > .item")).click();
    driver.findElement(By.id("delivery")).click();
    driver.findElement(By.id("via")).click();
    driver.findElement(By.id("via")).sendKeys("Cortile Radunanza ");
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).sendKeys("33");
    driver.findElement(By.id("cap")).click();
    driver.findElement(By.id("cap")).sendKeys("80047");
    driver.findElement(By.id("citta")).click();
    driver.findElement(By.id("citta")).sendKeys("San Giuseppe Vesuviano");
    driver.findElement(By.id("provincia")).click();
    driver.findElement(By.id("provincia")).sendKeys("N");
    driver.findElement(By.cssSelector(".container button")).click();
    assertThat(driver.switchTo().alert().getText(), is("formato provincia non corretto"));
  }
  @Test
  public void tC16() throws InterruptedException {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(782, 823));
    driver.findElement(By.id("email")).sendKeys("fernandaiannuzzi@example.org");
    driver.findElement(By.id("password")).sendKeys("yBmaNPq%Qw!v5C2r");
    driver.findElement(By.cssSelector(".inputButton")).click();
    sleep(2000);
    driver.findElement(By.cssSelector("a:nth-child(6) > .imgIcon")).click();
    driver.findElement(By.cssSelector(".item-quant > form > .item")).click();
    driver.findElement(By.id("delivery")).click();
    driver.findElement(By.id("via")).click();
    driver.findElement(By.id("via")).sendKeys("Cortile Radunanza ");
    driver.findElement(By.id("civico")).click();
    driver.findElement(By.id("civico")).sendKeys("33");
    driver.findElement(By.id("cap")).sendKeys("80047");
    driver.findElement(By.id("citta")).sendKeys("San Giuseppe Vesuviano");
    driver.findElement(By.id("provincia")).sendKeys("NA");
    driver.findElement(By.cssSelector(".container button")).click();
  }
}
