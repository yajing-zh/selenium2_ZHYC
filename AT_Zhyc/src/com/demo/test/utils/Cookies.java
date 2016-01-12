package com.demo.test.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies {
	/**
	 * @author Yajing
	 * 
	 */
	public static void addCookies() {
		// WebDriver driver = seleniumUtil.driver;
		WebDriver driver = new FirefoxDriver();
		driver.navigate()
				.to("http://passport.chinahr.com/pc/tologin?backUrl=http://www.chinahr.com/beijing/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement user = driver.findElement(By.xpath(".//*[@id='account']"));
		user.clear();
		user.sendKeys("15032051462");
		WebElement password = driver.findElement(By
				.xpath(".//*[@id='secretPWD']"));
		password.clear();
		password.sendKeys("test@123");

		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		WebElement submit = driver.findElement(By
				.xpath(".//*[@id='normalLogin']"));
		// submit.submit();
		submit.click();

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File file = new File("broswer.data");
		try {
			// delete file if exists
			file.delete();
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Cookie ck : driver.manage().getCookies()) {
				bw.write(ck.getName() + ";" + ck.getValue() + ";"
						+ ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure());
				bw.newLine();
			}
			bw.flush();
			bw.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("cookie write to file");
		}
	}

	public static void main(String[] args) {
		// addCookies();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.chinahr.com/beijing/");
		try {
			File file = new File("broswer.data");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(line, ";");
				while (str.hasMoreTokens()) {
					String name = str.nextToken();
					String value = str.nextToken();
					String domain = str.nextToken();
					String path = str.nextToken();
					Date expiry = null;
					String dt;
					if (!(dt = str.nextToken()).equals(null)) {
						// expiry=new Date(dt);
						System.out.println();
					}
					boolean isSecure = new Boolean(str.nextToken())
							.booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry,
							isSecure);
					driver.manage().addCookie(ck);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.get("http://www.chinahr.com/beijing/");
	}
}
