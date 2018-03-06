//package com.test.lab;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestA {
    private static WebDriver driver;


    @BeforeClass
    public static void open() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void myTestA() {
        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
        element.sendKeys("webinar.test@gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, 40);
        element = driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys("Xcg7299bnSmMuRLp9ITw");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='imgm img-thumbnail']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("header_logout"))).click();

    }
    @Test
    public void myTestB() {

        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
        element.sendKeys("webinar.test@gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, 40);
        element = driver.findElement(By.xpath("//input[@type='password']"));
        element.sendKeys("Xcg7299bnSmMuRLp9ITw");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminDashboard&amp;token=f57b9e0913a4757c6ba02314cf473896']"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminOrders&amp;token=7ead7bce03989a6d951ba373a5ea1b19']"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Каталог"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Клиенты"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Служба поддержки"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Статистика"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Modules"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Design"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Доставка"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Способ оплаты"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("International"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Shop parameters"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Конфигурация"))).click();
        driver.navigate().refresh();
    }
    @AfterClass
    public static void close() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}

