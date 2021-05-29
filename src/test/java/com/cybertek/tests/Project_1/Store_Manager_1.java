package com.cybertek.tests.Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

    public class Store_Manager_1 {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = WebDriverFactory.getDriver("Chrome");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://qa3.vytrack.com/user/login%22");

            WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
            username.sendKeys("storemanager87");
            Thread.sleep(2000);

            WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
            password.sendKeys("UserUser123");
            Thread.sleep(2000);

            WebElement logInButton = driver.findElement(By.xpath("//button[@id='_submit']"));
            logInButton.click();

            String expectedTitle = "Dashboard";
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)){
                System.out.println("Welcome to your dashboard: Store Manager 1!!!");
            }else{
                System.out.println("Invalid log in");
            }
            Thread.sleep(4000);
            // driver.close();
        }

    }

