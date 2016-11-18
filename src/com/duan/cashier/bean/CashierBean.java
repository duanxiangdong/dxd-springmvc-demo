package com.duan.cashier.bean;

public class CashierBean {

	private String operator; 		// 操作人ID,默认为机构业务
	private String userId; 			// 付款人id,个人或机构ID<收银台基础属性>
	private String userIdIn; 		// 收款人id<收银台基础属性>
	private String sellerId; 		// 卖家ID
	private String sellerName; 		// 卖家名称
	private String orderNo; 		// 业务流水号<收银台基础属性>
	private String businessNo; 		// 业务订单号<收银台基础属性>
	private String ttype; 			// 交易类型
	private String amount; 			// 交易金额<收银台基础属性>
	private String tsource; 		// 交易来源<收银台基础属性>
	private String resulturl; 		// 回调地址<收银台基础属性>
	private String times; 			// 交易时间<收银台基础属性>
	private String signmsg; 		// 签名信息<收银台基础属性>
	private String payType; 		// 支付方式
	private String pptype; 			// 支付用途的类型
	private String ppurp; 			// 支付用途
	private String tstatus; 		// 交易状态
	private String applyDate; 		// 基金公司接收申请时间
	private String message; 		// 交易状态描述
	private String isComm; 			// 是否对公<收银台基础属性>
	private String productName; 	// 商品名称
	private String productNumber; 	// 商品数量
	private String shareData; 		// 分账公式<收银台基础属性>

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdIn() {
		return userIdIn;
	}

	public void setUserIdIn(String userIdIn) {
		this.userIdIn = userIdIn;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTsource() {
		return tsource;
	}

	public void setTsource(String tsource) {
		this.tsource = tsource;
	}

	public String getResulturl() {
		return resulturl;
	}

	public void setResulturl(String resulturl) {
		this.resulturl = resulturl;
	}

	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
	}

	public String getSignmsg() {
		return signmsg;
	}

	public void setSignmsg(String signmsg) {
		this.signmsg = signmsg;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPptype() {
		return pptype;
	}

	public void setPptype(String pptype) {
		this.pptype = pptype;
	}

	public String getPpurp() {
		return ppurp;
	}

	public void setPpurp(String ppurp) {
		this.ppurp = ppurp;
	}

	public String getTstatus() {
		return tstatus;
	}

	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getIsComm() {
		return isComm;
	}

	public void setIsComm(String isComm) {
		this.isComm = isComm;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getShareData() {
		return shareData;
	}

	public void setShareData(String shareData) {
		this.shareData = shareData;
	}
}