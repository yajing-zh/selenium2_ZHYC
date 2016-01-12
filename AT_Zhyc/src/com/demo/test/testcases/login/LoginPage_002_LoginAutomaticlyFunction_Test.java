package com.demo.test.testcases.login;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;

/**
 * @author Yajing
 * @description 验证自动登录之后用户名是否正确
 * */

public class LoginPage_002_LoginAutomaticlyFunction_Test extends BaseParpare {

	@Test(dataProvider = "testData")
	public void loginAutomaticlyFunction(Map<String, String> data) {
		// 等待首页元素加载完毕
		HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);

		// 点击首页的求职者登录链接
		// HomePageHelper.clickOnHomePage(seleniumUtil, HomePage.HP_LINK_LOGIN);

		// 点击log in链接，进入登录页面
		// HomePageHelper.clickOnHomePage(seleniumUtil, HomePage.HP_LINK_LOGIN);

		// 等待登录页面加载
		// LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);

		// 输入登录信息
		// LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("PHONENUMBER"),
		// data.get("PASSWORD"));

		// 检查用户名是不是和你注册的时候填写的名字一致
		HomePageHelper.checkUserName(seleniumUtil, data.get("FULLNAME"),
				timeOut);
	}
}
