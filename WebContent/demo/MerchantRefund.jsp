<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import = "com.abc.trustpay.client.ebus.*" %>
<%@ page import = "com.abc.trustpay.client.*" %>
<% 
request.setCharacterEncoding("gb2312");
response.setHeader("Cache-Control", "no-cache"); %>
<HTML>
<HEAD><TITLE>农行网上支付平台-商户接口范例-单笔退款</TITLE></HEAD>
<BODY BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000FF' VLINK='#0000FF' ALINK='#FF0000'>
<CENTER>单笔退款<br>
<%
        //1、生成退款请求对象
        RefundRequest tRequest = new RefundRequest();
        tRequest.dicRequest.put("OrderDate", request.getParameter("txtOrderDate"));  //订单日期（必要信息）
        tRequest.dicRequest.put("OrderTime", request.getParameter("txtOrderTime")); //订单时间（必要信息）
        //tRequest.dicRequest.put("MerRefundAccountNo", request.getParameter("txtMerRefundAccountNo"));  //商户退款账号
        //tRequest.dicRequest.put("MerRefundAccountName", request.getParameter("txtMerRefundAccountName")); //商户退款名
        tRequest.dicRequest.put("OrderNo", request.getParameter("txtOrderNo")); //原交易编号（必要信息）
        tRequest.dicRequest.put("NewOrderNo", request.getParameter("txtNewOrderNo")); //交易编号（必要信息）
        tRequest.dicRequest.put("CurrencyCode", request.getParameter("txtCurrencyCode")); //交易币种（必要信息）
        tRequest.dicRequest.put("TrxAmount", request.getParameter("txtTrxAmount")); //退货金额 （必要信息）
        //tRequest.dicRequest.put("MerchantRemarks", request.getParameter("txtMerchantRemarks"));  //附言

        //2、传送退款请求并取得退货结果
        JSON json = tRequest.postRequest();

        //3、判断退款结果状态，进行后续操作
        StringBuilder strMessage = new StringBuilder("");
        String ReturnCode = json.GetKeyValue("ReturnCode");
        String ErrorMessage = json.GetKeyValue("ErrorMessage");
        if (ReturnCode.equals("0000"))
        {
            //4、退款成功
             out.println("ReturnCode   = [" + ReturnCode + "]<br/>");
             out.println("ErrorMessage = [" + ErrorMessage + "]<br/>");
             out.println("OrderNo   = [" + json.GetKeyValue("OrderNo") + "]<br/>");
             out.println("NewOrderNo   = [" + json.GetKeyValue("NewOrderNo") + "]<br/>");
             out.println("TrxAmount = [" + json.GetKeyValue("TrxAmount") + "]<br/>");
             out.println("BatchNo   = [" + json.GetKeyValue("BatchNo") + "]<br/>");
             out.println("VoucherNo = [" + json.GetKeyValue("VoucherNo") + "]<br/>");
             out.println("HostDate  = [" + json.GetKeyValue("HostDate") + "]<br/>");
             out.println("HostTime  = [" + json.GetKeyValue("HostTime") + "]<br/>");
             out.println("iRspRef  = [" + json.GetKeyValue("iRspRef") + "]<br/>");
        }
        else
        {
			out.println("ReturnCode   = [" + ReturnCode + "]<br>");
			out.println("ErrorMessage = [" + ErrorMessage + "]<br>");
		}
%>
<a href='Merchant.html'>回商户首页</a></CENTER>
</BODY></HTML>