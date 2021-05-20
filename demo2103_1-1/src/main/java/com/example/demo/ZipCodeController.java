package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //컨트롤과 업무가 1:1로 매칭되어 있음 
@RequestMapping("/zipcode/*")//사용자가 요청(url)을 작성(/zipcode/*) 한 것이 java 와 연결
public class ZipCodeController {
	Logger logger = LogManager.getLogger(ZipCodeController.class);
	@Autowired(required=true)//외부로부터 객체 주입 
	private ZipCodeLogic zipCodeLogic = null;
	@RequestMapping("getZipCodeList")
	public String getZipCodeList(HttpServletRequest req) {
		logger.info("getZipCodeList 호출 성공");
		List<Map<String,Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		req.setAttribute("zipList", zipList);
		//return "forward:getZipCodeList.jsp";
		//WEB-INF/jsp/zipcode/getZipCodeList.jsp.jsp -> 404
		return "zipcode/getZipCodeList";
	}
	@RequestMapping("getZipCodeList2")
	//MOdelAndView 자체의 scope가 reqeust -> parameter에 request가 없어도 돌아간다. 
		public ModelAndView getZipCodeList2() {
			logger.info("getZipCodeList 호출 성공");
			List<Map<String,Object>> zipList = null;
			zipList = zipCodeLogic.getZipCodeList();
			ModelAndView mav = new ModelAndView();
			mav.setViewName("zipcode/getZipCodeList");
			mav.addObject("zipList", zipList);
			//return "forward:getZipCodeList.jsp";
			//WEB-INF/jsp/zipcode/getZipCodeList.jsp.jsp -> 404
			//return "zipcode/getZipCodeList";
			return mav;
		}
}
