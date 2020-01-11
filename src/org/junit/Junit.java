package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
    public static WebDriver d;
    //@BeforeClass
    public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIAKA-DINESH\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
        d = new ChromeDriver();
        d.get("https://www.adactin.com/HotelApp/");
	}
    public static void test1() {
		WebElement email = d.findElement(By.id("username"));
		email.sendKeys("Dineshkumar95");
		WebElement pass = d.findElement(By.id("password"));
		pass.sendKeys("Welcome@1");
	}
    //@AfterClass
    public static void afterClass() {
		String txt = d.getCurrentUrl();
		System.out.println(txt);

	}
    
}
