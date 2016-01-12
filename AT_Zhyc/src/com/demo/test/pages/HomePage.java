package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * @author Young
 * @description 首页面元素定位声明
 * */
public class HomePage {

	// 中华英才网
	public static final By HP_LINK_ZHYC = By
			.xpath("/html/body/div[1]/div[2]/div/div[1]/a");

	// 求职者登录
	public static final By HP_LINK_LOGIN = By
			.xpath(".//*[@id='personalLogin']");

	// 登录用户名
	public static final By HP_LINK_USERNAME = By.xpath(".//*[@id='user_name']");

	// /** 首页-ACCOUNT链接 */
	// public static final By HP_LINK_ACCOUNT = By
	// .xpath("//*[@class='label' and text()='Account']");
	// /** 首页-购物车链接 */
	// public static final By HP_LINK_CART = By
	// .xpath("//*[@class='label' and text()='Cart']");
	//
	// /** 欢迎信息 */
	// public static final By HP_TEXT_WELCOME = By.className("welcome-msg");
	// /** 搜索框 */
	// public static final By HP_INPUT_SEARCH = By.id("search");
	// /** 分类 */
	// public static final By HP_LINK_CLASSIFY = By
	// .cssSelector("a.level0.has-children");
	//
	// /** VIP链接 */
	// public static final By HP_LINK_VIP = By.linkText("VIP");
	// /** 搜索按钮 */
	// public static final By HP_BUTTON_SEARCH = By
	// .xpath("//*[@id='search_mini_form']//button");
	//
	// // 以下元素是点击了account元素才显示出来的
	//
	// /** 首页-账户下的登录链接 */
	// public static final By HP_LINK_LOGIN = By.linkText("Log In");
	//
	// // 以下元素是点击了account元素才显示出来的

}
