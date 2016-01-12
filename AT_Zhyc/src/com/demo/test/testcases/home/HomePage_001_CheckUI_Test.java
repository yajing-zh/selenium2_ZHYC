package com.demo.test.testcases.home;

import org.testng.annotations.Test;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;

/**
 * @author Yajing
 * @description 检测首页UI是不是正确的
 * */

public class HomePage_001_CheckUI_Test extends BaseParpare {
	@Test
	public void checkUI() {
		// System.out.println("mememememememememem");
		// 等待首页元素加载完毕
		HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
		// 检查首页元素文本
		HomePageHelper.checkHomePageElementText(seleniumUtil);
	}
}
