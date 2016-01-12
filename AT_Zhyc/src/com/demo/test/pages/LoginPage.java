package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Young
 * @description 登录页面元素定位声明
 * */
public class LoginPage {
	/** 登录页面-邮箱输入框 */
	public static final By LP_INPUT_ACCOUNT = By.id("account");

	/** 登录页面-密码输入框 */
	public static final By LP_INPUT_PASSWORD = By.id("secretPWD");

	/** 登录按钮 */
	public static final By LP_BUTTON_LOGIN = By.id("normalLogin");

	/** 密码为空提示语 */
	public static final By LP_TEXT_PASSWORDEMPTYINFO = By
			.id("advice-required-entry-pass");

}
