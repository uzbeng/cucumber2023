package com.test.cucumber.stepdefinitions;

import java.time.Duration;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class JavaSteps {
	
	private WebDriver driver;
	
	@Given("User opens chrome browser")
	public void user_opens_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().setPosition(new Point(-1800, 0));
		driver.manage().window().maximize();
	}
	
	@Given("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}
	
	@When("User inserts username {string}")
	public void user_inserts_username(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}
	
	@When("User inserts password {string}")
	public void user_inserts_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("User clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
	
	@Then("User successfully logs in and home page is displayed")
	public void user_successfully_logs_in_and_home_page_is_displayed() {
	   int foundElements = driver.findElements(By.xpath("//span[text()='Products']")).size();
	   Assert.assertTrue(foundElements > 0);
	}
	

	@Then("Error message is displayed")
	public void error_message_is_displayed() {
		int foundElements = driver.findElements(By.xpath("//h3[@data-test='error']")).size(); 
		 Assert.assertTrue(foundElements > 0);
	}







}
