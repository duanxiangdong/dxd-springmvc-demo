package com.duan.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/payment")
public class CashierController {
	@RequestMapping(value = "/toCashier")
	public String login() {
		return "/login/toCashier";
	}

	@RequestMapping(value = "/toAppCashier")
	public String toAppCashier(HttpServletRequest request) {
		return "/login/toAppCashier";
	}
	
	@SuppressWarnings("all")
	@RequestMapping(value="/requestTest.shtml",produces = "text/plain;charset=UTF-8")
	public @ResponseBody String requestTest(HttpServletRequest request){
		String contextPath = request.getContextPath();  // 应用的web目录的名称
		String contentType = request.getHeader("Content-type");
		String servletPath  = request.getServletPath(); //请求路径
		String strDirPath = request.getSession().getServletContext().getRealPath("/"); //获取Web项目的全路径
		return strDirPath;
	}
}
