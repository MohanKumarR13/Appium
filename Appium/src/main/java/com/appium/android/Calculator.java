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

public class Calculator {
	// public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12.0");
		capabilities.setCapability("udid", "f52d58f46628");
		capabilities.setCapability("deviceName", "Redmi Note 11 Pro+ 5G");

		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		/*
		 * capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 * capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "Android");
		 * capabilities.setCapability(MobileCapabilityType.UDID, "Android");
		 * capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		 * capabilities.setCapability(MobileCapabilityType.pack, "Android");
		 */
		// URL url=new URL("http://0..0.0.0:4723/wd/hub");
		URL url = new URL("http://0.0.0.0:4723/");
		AndroidDriver driver = new AndroidDriver(url, capabilities);
		Thread.sleep(5000);
		String oneNumber = driver.findElement(By.id("com.google.android.calculator:id/digit_1")).getText();
		System.out.println(oneNumber);
		String add = driver.findElement(By.id("com.google.android.calculator:id/op_add")).getText();
		System.out.println(add);
		String twoNumber = driver.findElement(By.id("com.google.android.calculator:id/digit_2")).getText();
		System.out.println(twoNumber);
		String equalsTo = driver.findElement(By.id("com.google.android.calculator:id/eq")).getText();
		System.out.println(equalsTo);
		WebElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
		one.click();
		WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		plus.click();
		WebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		two.click();
		WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		equals.click();

	}

}
