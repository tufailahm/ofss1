package com.training.ofss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchFunctionalityTest {

	WebDriver driver;
	
	@BeforeEach
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	void testSearch() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("speakers");
		//how you can click on the search button
		driver.findElement(By.id("nav-search-submit-button")).click();

	}
}







