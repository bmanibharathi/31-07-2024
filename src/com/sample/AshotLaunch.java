package com.sample;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotLaunch {
	    public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Screenshot ref= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		File target= new File("D:\\selenium\\AshotAmazon.jpeg");
		boolean write = ImageIO.write(ref.getImage(),"jpeg", target);
		System.out.println(write);
		
		
		

}
}