package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Click {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://skillfactory.ru/courses");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.xpath("//*[@id=\"rec683479329\"]/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"sbs-806166024-1678370260112\"]/div/a")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}