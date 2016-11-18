package com.duan.cashier.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.nxin.sysmodule.security.MD5;
import com.nxin.sysmodule.util.CollectionUtils;
import com.nxin.sysmodule.util.Constants;
import com.nxin.sysmodule.util.DateUtils;

@Controller
@RequestMapping(value = "/payment")
public class CashierController {
	@RequestMapping(value = "/toCashier")
	public String login(ModelMap map) {
		String times = DateUtils.formatDate(new Date(), Constants.DATE_TIME_FORMAT_OTHER);
		
		Map<String, Object> jsonMap1 = new HashMap<String, Object>();
		String busiDetailNo = "BusDetailNo_duan" + times;
		jsonMap1.put("busiDetailNo", busiDetailNo);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		jsonMap1.put("data", list);
		Map<String, String> detialMap2 = new HashMap<String, String>();
		detialMap2.put("merchantId", "1253091");
		detialMap2.put("expenseType", "GOODS");
		detialMap2.put("amount", "0.01");
		detialMap2.put("merchantType", "2");
		list.add(detialMap2);
		
		List<Map<String, Object>> jsonList = new ArrayList<Map<String, Object>>();
		jsonList.add(jsonMap1);		
		String shareData = JSONObject.toJSONString(jsonList);
		
		Map<String,String> cashierMap = new HashMap<String,String>();
		cashierMap.put("shareData", shareData);
		cashierMap.put("userIdIn", "634086739144001641");
		cashierMap.put("ttype", "3");
		cashierMap.put("sellerName", "测试选手");
		cashierMap.put("tsource", "5");
		cashierMap.put("isComm", "1");
		cashierMap.put("operator", "30618");
		cashierMap.put("resulturl", "http://zjs.t.nxin.com/mob/order/pig/loadOrderDetail.do?orderId=S16091316340001");
		cashierMap.put("productNumber", "1");
		cashierMap.put("productName", "测试产品");
		cashierMap.put("pptype", "0");
		cashierMap.put("amount", "0.01");
		
		String orderNo = "test_duan"+ times;
		String businessNo = "BusNo_duan" + times;
		cashierMap.put("orderNo", orderNo);
		cashierMap.put("ppurp", "支付货款");
		cashierMap.put("businessNo", businessNo);
		cashierMap.put("sellerId", "1253091");
		cashierMap.put("userId", "30618");
		cashierMap.put("payType", "NFB,SZD,QB,HYLDS,HK,ABCWG,XYF,QP,WX");
		cashierMap.put("times", times);
		String signmsgStr = CollectionUtils.sortParamMap(cashierMap);
		System.out.println(signmsgStr);
		String signmsg = MD5.encryption(signmsgStr);
		
		cashierMap.put("signmsg", signmsg);
		
		map.addAllAttributes(cashierMap);
		
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
