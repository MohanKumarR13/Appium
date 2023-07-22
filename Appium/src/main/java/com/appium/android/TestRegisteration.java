package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestRegisteration {
	// public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12.0");
		capabilities.setCapability("udid", "f52d58f46628");
		capabilities.setCapability("deviceName", "Redmi Note 11 Pro+ 5G");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		// URL url=new URL("http://0..0.0.0:4723/wd/hub");
		URL url = new URL("http://0.0.0.0:4723/");
		AndroidDriver driver = new AndroidDriver(url, capabilities);
		Thread.sleep(5000);

		WebElement continueBtn = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		continueBtn.click();
		driver.navigate().back();

		Thread.sleep(5000);
		
		WebElement registerBtn = driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		registerBtn.click();
		Thread.sleep(5000);
		driver.navigate().back();

		WebElement userName = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		userName.click();
		userName.sendKeys("Mohan");
		WebElement email = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		email.click();
		email.sendKeys("mohan@gmail.com");
		WebElement pwd = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		pwd.click();
		pwd.sendKeys("Mohan123@");

		WebElement name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.click();
		name.clear();
		name.sendKeys("Mohan");
		driver.navigate().back();
		WebElement progLang = driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
		progLang.click();

		WebElement java = driver.findElement(By.xpath("//*[@text='Java']"));
		java.click();

		WebElement acceptAds = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));
		acceptAds.click();
		pwd.sendKeys("Mohan123@");

		WebElement register = driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser"));
		register.click();
		Thread.sleep(2500);
		driver.navigate().back();
	}

}
