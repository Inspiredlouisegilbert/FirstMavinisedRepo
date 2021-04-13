package com.org.firstMavenisedProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New Banch");
		// declaration and instatiation of the obeject and variables
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	}

}
