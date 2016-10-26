<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<%
	String errorCode = (String) request.getAttribute("tReturnCode");
	String errorMsg = (String) request.getAttribute("tErrorMsg");
	System.out.println(errorCode+"====="+errorMsg);
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<div>
	签名错误代码:<input type="text" id="code" name="code" value="<%=errorCode  %>" />
	签名错误描述:<input type="text" id="msg" name="msg" value="<%=errorMsg  %>" />
</div>
</body>	
</html>