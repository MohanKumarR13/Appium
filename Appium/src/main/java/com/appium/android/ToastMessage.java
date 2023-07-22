package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToastMessage {
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
			
			WebElement toastBtn = driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
			toastBtn.click();
			
			WebElement toastMessage = driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));
			String message=toastMessage.getText();
			System.out.println(message);
}}
