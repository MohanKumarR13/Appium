package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExpandableList {
	// public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12.0");
		capabilities.setCapability("udid", "f52d58f46628");
		capabilities.setCapability("deviceName", "Redmi Note 11 Pro+ 5G");
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.view.ExpandableList1");
		// URL url=new URL("http://0..0.0.0:4723/wd/hub");
		URL url = new URL("http://0.0.0.0:4723/");
		AndroidDriver driver = new AndroidDriver(url, capabilities);
		Thread.sleep(3000);
		WebElement continueBtn = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]"));
		continueBtn.click();

		WebElement peopleName = driver.findElement(By.xpath("//*[@text='People Names']"));
		peopleName.click();

		List<WebElement> listOfNames = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		for (WebElement name : listOfNames) {
			String textValue = name.getAttribute("text");
			if (!textValue.equalsIgnoreCase("Dog Names")) {
				System.out.println(textValue);
			} else {
				break;
			}
		}
	}
}
