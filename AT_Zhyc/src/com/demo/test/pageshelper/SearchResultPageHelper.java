package com.demo.test.pageshelper;

import com.demo.test.pages.SearchResultPage;
import com.demo.test.utils.SeleniumUtil;

/**
 * @author Young
 * @description 搜索结果页面帮助类
 * */
public class SearchResultPageHelper {
	
	
	/**等待搜索结果页面元素加载*/
	public static void waitSearchResultPageElementLoad(SeleniumUtil seleniumUtil,int timeOut){
		
		seleniumUtil.waitForElementToLoad(timeOut, SearchResultPage.SRP_TEXT_TITLE);
		
	}
	
	/**检查搜索结果是不是正确的*/
	public static void checkSearchResult(SeleniumUtil seleniumUtil,String keyword){
		String expected = "Search results for "+"'"+keyword.toLowerCase()+"'";
		seleniumUtil.isTextCorrect(seleniumUtil.getText(SearchResultPage.SRP_TEXT_TITLE).toLowerCase(), expected.toLowerCase());
	}
	
	

}
