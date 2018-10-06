package com.seleniumlive.guru;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MobileList
{
	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver", "D:/selenium 1/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://live.guru99.com//index.php");
		
		String exp_title= "THIS IS DEMO SITE FOR", act_title;
		try
		{
			act_title= driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[1]/div/div/h2/text()")).getText();
			if(act_title.equalsIgnoreCase(exp_title))
			{
				System.out.println("Title Verification Pass");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Title Verification Fail");
		}
			
		
		driver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).click();
		
		String exp="MOBILE",act=driver.getTitle();
		
		if (act.equalsIgnoreCase(exp))
		{
			System.out.println("title pass");
		}
		else 
		{
			System.out.println("title pass 234");
		}
		
		
		Select slist=new Select(driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		
		slist.selectByVisibleText("Name");
		
		driver.close();
		
	}

}
