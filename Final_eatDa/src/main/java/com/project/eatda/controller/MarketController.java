package com.project.eatda.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.eatda.biz.MarketBiz;
import com.project.eatda.dto.ProductDto;

@Controller
public class MarketController {
	private static final Logger logger = LoggerFactory.getLogger(MarketController.class);
	
	@Autowired
	private MarketBiz marketBiz;
	
	@RequestMapping(value="/product.do", method=RequestMethod.POST)
	@ResponseBody
	public List<ProductDto> takeProductList(@RequestBody String num) {
		logger.info("takeProductList");
		
		int iNum = Integer.parseInt(num.charAt(0)+"");
		List<ProductDto> list = marketBiz.takeProductList(iNum);
		
		return list;
	}
	
	@RequestMapping(value="/ajaxtest.do", method=RequestMethod.POST)
	@ResponseBody
	public String ajaxtest(@RequestBody String num) {
		logger.info("ajaxtest");
		return num;
	}
	
	
	@RequestMapping("/marketMain.do")
	public String goMarketMain(Model model) {
		logger.info("Market Main Page");
		return "/market/marketMain";
	}
	
	@RequestMapping("/page.do") 
	public String goMarketPage() {
		logger.info("Market Each Page");
		return "/market/marketPage";
	}
	
	@RequestMapping("/shoppingbag.do")
	public String test3() {
		System.out.println("test3");
		return "/market/shoppingBag";
	}
	
	@RequestMapping("/orderSuccess.do")
	public String test4() {
		System.out.println("test4");
		return "/market/orderSuccess";
	}
	
	@RequestMapping("/payment.do")
	public String test5() {
		System.out.println("test5");
		return "/market/payment";
	}
	

}
